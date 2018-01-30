/**
 * 
 */
package asd.booking.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import asd.booking.domain.Address;
import asd.booking.domain.Customer;
import asd.booking.domain.Payment;

/**
 * @author luatnguyen
 *
 */

import asd.booking.domain.User;
import asd.booking.utils.CardType;

public class UserDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;

	public static Customer login(User user) {
		Customer cust = new Customer();
		// preparing some objects for connection
		Statement stmt = null;

		String username = user.getUserName();
		String password = user.getPassword();

		StringBuffer searchQuery = new StringBuffer();
		searchQuery.append("select *, aa.addressid as payment_street1, aa.street2 as payment_street2, aa.city as payment_city, aa.zipcode as payment_zipcode, aa.state as payment_state from user u");
		searchQuery.append(" left JOIN customer c ON u.customerid = c.customerid left join address a on c.addressid = a.addressid left join payment p on c.paymentid = p.paymentid left join address aa on p.addressid = aa.addressid");
		searchQuery.append(" where username='" + username + "' AND password='" + password + "'");
		// "System.out.println" prints in the console; Normally used to trace the
		// process
		System.out.println("Your user name is " + username);
		System.out.println("Your password is " + password);
		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery.toString());
			boolean more = rs.next();

			// if user does not exist set the isValid variable to false
			if (!more) {
				System.out.println("Sorry, you are not a registered user! Please sign up first");
				user.setValid(false);
			}

			// if user exists set the isValid variable to true
			else if (more) {
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastname");
				String telephone = rs.getString("cellphone");
				String email = rs.getString("email");
				
				String street1 = rs.getString("street1");
				String street2 = rs.getString("street2");
				String city = rs.getString("city");
				String zipcode = rs.getString("zipcode");
				String state = rs.getString("state");
				Address address = new Address(street1, street2, city, zipcode, state);
				
				String cardType = rs.getString("cardtype");
				String holderName = rs.getString("holdername");
				String cardNumber = rs.getString("cardnumber");
				String expiredMonth = rs.getString("expiredmonth");
				String expiredYear = rs.getString("expiredyear");
				String ccv = rs.getString("ccv");
				Payment payment = new Payment(CardType.VISA, holderName, cardNumber, expiredMonth, expiredYear, ccv);
				
				String payment_street1 = rs.getString("payment_street1");
				String payment_street2 = rs.getString("payment_street2");
				String payment_city = rs.getString("payment_city");
				String payment_zipcode = rs.getString("payment_zipcode");
				String payment_state = rs.getString("payment_state");
				Address paymentAddress = new Address(payment_street1, payment_street2, payment_city, payment_zipcode, payment_state);
				
				user.setValid(true);
				payment.setBillingAddress(paymentAddress);
				cust = new Customer(firstName, lastName, telephone, email, user);
				cust.setAddress(address);
				cust.setPayment(payment);
				System.out.println("Welcome " + firstName);
				
			}
		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		return cust;
	}
}
