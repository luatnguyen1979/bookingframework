CREATE TABLE address
(
  addressid INT AUTO_INCREMENT
    PRIMARY KEY,
  street1   VARCHAR(45) NOT NULL,
  street2   VARCHAR(45) NULL,
  city      VARCHAR(45) NOT NULL,
  zipcode   VARCHAR(45) NOT NULL,
  state     VARCHAR(45) NOT NULL,
  CONSTRAINT addressid_UNIQUE
  UNIQUE (addressid)
)
  ENGINE = InnoDB
  CHARSET = latin1;

CREATE TABLE customer
(
  customerid INT AUTO_INCREMENT
    PRIMARY KEY,
  firstname  VARCHAR(45) NOT NULL,
  lastname   VARCHAR(45) NOT NULL,
  cellphone  VARCHAR(45) NOT NULL,
  email      VARCHAR(45) NULL,
  addressid  INT         NULL,
  paymentid  INT         NULL,
  CONSTRAINT customerid_UNIQUE
  UNIQUE (customerid),
  CONSTRAINT fk_customer_address
  FOREIGN KEY (addressid) REFERENCES address (addressid)
)
  ENGINE = InnoDB
  CHARSET = latin1;

CREATE INDEX fk_customer_address_idx
  ON customer (addressid);

CREATE INDEX fk_customer_payment_idx
  ON customer (paymentid);

CREATE TABLE passenger
(
  id       INT AUTO_INCREMENT
    PRIMARY KEY,
  fullname VARCHAR(50) NULL,
  type     VARCHAR(10) NOT NULL
)
  ENGINE = InnoDB;

CREATE TABLE passenger_trip
(
  trip_id      INT NOT NULL,
  passenger_id INT NOT NULL,
  CONSTRAINT passenger_trip_passenger_id_fk
  FOREIGN KEY (passenger_id) REFERENCES passenger (id)
)
  ENGINE = InnoDB;

CREATE INDEX passenger_trip_trip_id_fk
  ON passenger_trip (trip_id);

CREATE INDEX passenger_trip_passenger_id_fk
  ON passenger_trip (passenger_id);

CREATE TABLE payment
(
  paymentid    INT AUTO_INCREMENT
    PRIMARY KEY,
  cardtype     VARCHAR(45) NULL,
  holdername   VARCHAR(45) NULL,
  cardnumber   VARCHAR(45) NULL,
  expiredmonth VARCHAR(45) NULL,
  expiredyear  VARCHAR(45) NULL,
  ccv          VARCHAR(45) NULL,
  addressid    INT         NULL,
  CONSTRAINT paymentid_UNIQUE
  UNIQUE (paymentid),
  CONSTRAINT fk_payment_address
  FOREIGN KEY (addressid) REFERENCES address (addressid)
)
  ENGINE = InnoDB
  CHARSET = latin1;

CREATE INDEX fk_payment_address_idx
  ON payment (addressid);

ALTER TABLE customer
  ADD CONSTRAINT fk_customer_payment
FOREIGN KEY (paymentid) REFERENCES payment (paymentid);

CREATE TABLE port
(
  id         INT AUTO_INCREMENT
    PRIMARY KEY,
  name       VARCHAR(45) NOT NULL,
  address_id INT         NOT NULL,
  CONSTRAINT fk_port_address
  FOREIGN KEY (address_id) REFERENCES address (addressid)
    ON UPDATE CASCADE
    ON DELETE CASCADE
)
  ENGINE = InnoDB;

CREATE INDEX port_name_index
  ON port (name);

CREATE INDEX fk_port_address
  ON port (address_id);

CREATE TABLE promotion
(
  id            INT AUTO_INCREMENT
    PRIMARY KEY,
  startdate     DATETIME      NOT NULL,
  enddate       DATETIME      NOT NULL,
  promotioncode VARCHAR(20)   NOT NULL,
  percent       DECIMAL(5, 2) NOT NULL
)
  ENGINE = InnoDB;

CREATE TABLE route
(
  id                 INT AUTO_INCREMENT
    PRIMARY KEY,
  sourceport_id      INT            NOT NULL,
  destinationport_id INT            NOT NULL,
  duration           DECIMAL(10, 2) NOT NULL,
  distance           DECIMAL(10, 2) NOT NULL,
  pricesingleway     DECIMAL(15, 2) NOT NULL,
  priceroundway      DECIMAL(15, 2) NOT NULL,
  CONSTRAINT fk_route_sourceport
  FOREIGN KEY (sourceport_id) REFERENCES port (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
  CONSTRAINT fk_route_destinationport_id
  FOREIGN KEY (destinationport_id) REFERENCES port (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
)
  ENGINE = InnoDB;

CREATE INDEX fk_route_sourceport
  ON route (sourceport_id);

CREATE INDEX fk_route_destinationport_id
  ON route (destinationport_id);

CREATE TABLE state
(
  id        INT AUTO_INCREMENT
    PRIMARY KEY,
  fullname  VARCHAR(45) NOT NULL,
  shortname CHAR(2)     NOT NULL,
  CONSTRAINT state_fullname_uindex
  UNIQUE (fullname),
  CONSTRAINT state_shortname_uindex
  UNIQUE (shortname)
)
  ENGINE = InnoDB;

CREATE TABLE train
(
  trainid  INT AUTO_INCREMENT
    PRIMARY KEY,
  name     VARCHAR(45) NOT NULL,
  model    VARCHAR(50) NOT NULL,
  madeby   VARCHAR(50) NOT NULL,
  type     VARCHAR(50) NOT NULL,
  capacity INT         NOT NULL,
  status   VARCHAR(50) NOT NULL,
  CONSTRAINT trainid_UNIQUE
  UNIQUE (trainid)
)
  ENGINE = InnoDB
  CHARSET = latin1;

CREATE TABLE trip
(
  id            INT        NOT NULL
    PRIMARY KEY,
  roundway      TINYINT(1) NOT NULL,
  departureDate DATETIME   NOT NULL,
  arrivalDate   DATETIME   NOT NULL,
  bookDate      DATETIME   NOT NULL,
  route_id      INT        NOT NULL,
  customer_id   INT        NOT NULL,
  CONSTRAINT trip_id_uindex
  UNIQUE (id),
  CONSTRAINT fk_route_route
  FOREIGN KEY (route_id) REFERENCES route (id)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
  CONSTRAINT fk_trip_customer
  FOREIGN KEY (customer_id) REFERENCES customer (customerid)
    ON UPDATE CASCADE
    ON DELETE CASCADE
)
  ENGINE = InnoDB;

CREATE INDEX fk_route_route
  ON trip (route_id);

CREATE INDEX fk_trip_customer
  ON trip (customer_id);

ALTER TABLE passenger_trip
  ADD CONSTRAINT passenger_trip_trip_id_fk
FOREIGN KEY (trip_id) REFERENCES trip (id);

CREATE TABLE user
(
  id         INT AUTO_INCREMENT,
  username   VARCHAR(45) NOT NULL,
  password   VARCHAR(45) NOT NULL,
  customerid INT         NULL,
  CONSTRAINT id_UNIQUE
  UNIQUE (id),
  CONSTRAINT username_UNIQUE
  UNIQUE (username),
  CONSTRAINT fd_user_customer
  FOREIGN KEY (customerid) REFERENCES customer (customerid)
)
  ENGINE = InnoDB
  CHARSET = latin1;

CREATE INDEX fd_user_customer_idx
  ON user (customerid);

INSERT INTO booking.address (addressid, street1, street2, city, zipcode, state) VALUES (1, '1000 N 4th st', null, 'Fairfield', '52557', 'IA');
INSERT INTO booking.address (addressid, street1, street2, city, zipcode, state) VALUES (2, '1302 S Main st', null, 'Fairfield', '52556', 'IA');
INSERT INTO booking.address (addressid, street1, street2, city, zipcode, state) VALUES (3, '1500 4th st', null, 'Fairfield', '52557', 'IA');INSERT INTO booking.customer (customerid, firstname, lastname, cellphone, email, addressid, paymentid) VALUES (1, 'LUAT', 'NGUYEN', '8484669338', 'LUATNGUYEN@GMAIL.COM', 1, 1);
INSERT INTO booking.customer (customerid, firstname, lastname, cellphone, email, addressid, paymentid) VALUES (2, 'KIMTEY', 'CHAV', '1234567890', 'KIMTEYCHAV@GMAIL.COM', 2, 2);
INSERT INTO booking.customer (customerid, firstname, lastname, cellphone, email, addressid, paymentid) VALUES (3, 'ENKH', 'ENKH', '0987654321', 'ENKH@GMAIL.COM', 3, 3);INSERT INTO booking.passenger (id, fullname, type) VALUES (1, 'Adult', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (2, 'Passenger with Disability (PWD)', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (3, 'Companion (Book with PWD)', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (4, 'AAA adult', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (5, 'NARP', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (6, 'Military Adult', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (7, 'Veterans advantage', 'Adult');
INSERT INTO booking.passenger (id, fullname, type) VALUES (8, 'Senior', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (9, 'Passenger with Disability (PWD)', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (10, 'Companion (Book with PWD)', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (11, 'AAA adult', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (12, 'NARP', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (13, 'Military Adult', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (14, 'Veterans advantage', 'Senior');
INSERT INTO booking.passenger (id, fullname, type) VALUES (15, 'Child', 'Child');
INSERT INTO booking.passenger (id, fullname, type) VALUES (16, 'Passenger with Disability (PWD)', 'Child');
INSERT INTO booking.passenger (id, fullname, type) VALUES (17, 'AAA Child', 'Child');
INSERT INTO booking.passenger (id, fullname, type) VALUES (18, 'Military Child', 'Child');
INSERT INTO booking.passenger (id, fullname, type) VALUES (19, 'Infant', 'Infant');INSERT INTO booking.payment (paymentid, cardtype, holdername, cardnumber, expiredmonth, expiredyear, ccv, addressid) VALUES (1, 'VISA', 'LUAT V NGUYEN', '1111222233334444', '12', '2020', '311', 1);
INSERT INTO booking.payment (paymentid, cardtype, holdername, cardnumber, expiredmonth, expiredyear, ccv, addressid) VALUES (2, 'DISCOVER', 'KIMTEY CHAV', '2222333344445555', '01', '2030', '002', 2);
INSERT INTO booking.payment (paymentid, cardtype, holdername, cardnumber, expiredmonth, expiredyear, ccv, addressid) VALUES (3, 'MASTERCARD', 'ENKH', '1234567887654321', '06', '2021', '123', 3);INSERT INTO booking.port (id, name, address_id) VALUES (1, 'Huntsville', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (2, 'Anchorage', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (3, 'Phoenix', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (4, 'Little Rock', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (5, 'Sacramento', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (6, 'Los Angeles', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (7, 'Beverly Hills', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (8, 'Denver', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (9, 'Hartford', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (10, 'Dover', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (11, 'Washington', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (12, 'Pensacola', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (13, 'Miami', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (14, 'Orlando', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (15, 'Atlanta', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (16, 'Honolulu', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (17, 'Montpelier', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (18, 'Chicago', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (19, 'Springfield', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (20, 'Indianapolis', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (21, 'Davenport', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (22, 'Des Moines', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (23, 'Wichita', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (24, 'Hazard', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (25, 'New Orleans', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (26, 'Freeport', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (27, 'Baltimore', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (28, 'Boston', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (29, 'Coldwater', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (30, 'Gaylord', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (31, 'Duluth', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (32, 'Biloxi', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (33, 'St. Louis', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (34, 'Laurel', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (35, 'Hastings', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (36, 'Reno', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (37, 'Ashland', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (38, 'Livingston', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (39, 'Santa Fe', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (40, 'New York', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (41, 'Oxford', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (42, 'Walhalla', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (43, 'Cleveland', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (44, 'Tulsa', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (45, 'Portland', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (46, 'Pittsburgh', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (47, 'Newport', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (48, 'Camden', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (49, 'Aberdeen', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (50, 'Nashville', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (51, 'Austin', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (52, 'Logan', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (53, 'Killington', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (54, 'Altavista', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (55, 'Bellevue (home of windoze)', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (56, 'Beaver', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (57, 'Milwaukee', 1);
INSERT INTO booking.port (id, name, address_id) VALUES (58, 'Pinedale', 1);INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (1, 1, 2, 600.00, 10.00, 31.00, 62.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (2, 2, 3, 1200.00, 20.00, 32.00, 64.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (3, 3, 4, 1800.00, 30.00, 33.00, 66.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (4, 4, 5, 2400.00, 40.00, 34.00, 68.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (5, 5, 6, 3000.00, 50.00, 35.00, 70.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (6, 6, 7, 3600.00, 60.00, 36.00, 72.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (7, 7, 8, 4200.00, 70.00, 37.00, 74.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (8, 8, 9, 4800.00, 80.00, 38.00, 76.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (9, 9, 10, 5400.00, 90.00, 39.00, 78.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (10, 10, 11, 6000.00, 100.00, 40.00, 80.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (11, 11, 12, 6600.00, 110.00, 41.00, 82.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (12, 12, 13, 7200.00, 120.00, 42.00, 84.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (13, 13, 14, 7800.00, 130.00, 43.00, 86.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (14, 14, 15, 8400.00, 140.00, 44.00, 88.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (15, 15, 16, 9000.00, 150.00, 45.00, 90.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (16, 16, 17, 9600.00, 160.00, 46.00, 92.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (17, 17, 18, 10200.00, 170.00, 47.00, 94.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (18, 18, 19, 10800.00, 180.00, 48.00, 96.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (19, 19, 20, 11400.00, 190.00, 49.00, 98.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (20, 20, 21, 12000.00, 200.00, 50.00, 100.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (21, 21, 22, 12600.00, 210.00, 51.00, 102.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (22, 22, 23, 13200.00, 220.00, 52.00, 104.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (23, 23, 24, 13800.00, 230.00, 53.00, 106.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (24, 24, 25, 14400.00, 240.00, 54.00, 108.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (25, 25, 26, 15000.00, 250.00, 55.00, 110.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (26, 26, 27, 15600.00, 260.00, 56.00, 112.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (27, 27, 28, 16200.00, 270.00, 57.00, 114.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (28, 28, 29, 16800.00, 280.00, 58.00, 116.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (29, 29, 30, 17400.00, 290.00, 59.00, 118.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (30, 30, 31, 18000.00, 300.00, 60.00, 120.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (31, 31, 32, 18600.00, 310.00, 61.00, 122.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (32, 32, 33, 19200.00, 320.00, 62.00, 124.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (33, 33, 34, 19800.00, 330.00, 63.00, 126.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (34, 34, 35, 20400.00, 340.00, 64.00, 128.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (35, 35, 36, 21000.00, 350.00, 65.00, 130.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (36, 36, 37, 21600.00, 360.00, 66.00, 132.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (37, 37, 38, 22200.00, 370.00, 67.00, 134.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (38, 38, 39, 22800.00, 380.00, 68.00, 136.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (39, 39, 40, 23400.00, 390.00, 69.00, 138.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (40, 40, 41, 24000.00, 400.00, 70.00, 140.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (41, 41, 42, 24600.00, 410.00, 71.00, 142.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (42, 42, 43, 25200.00, 420.00, 72.00, 144.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (43, 43, 44, 25800.00, 430.00, 73.00, 146.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (44, 44, 45, 26400.00, 440.00, 74.00, 148.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (45, 45, 46, 27000.00, 450.00, 75.00, 150.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (46, 46, 47, 27600.00, 460.00, 76.00, 152.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (47, 47, 48, 28200.00, 470.00, 77.00, 154.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (48, 48, 49, 28800.00, 480.00, 78.00, 156.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (49, 49, 50, 29400.00, 490.00, 79.00, 158.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (50, 50, 51, 30000.00, 500.00, 80.00, 160.00);
INSERT INTO booking.route (id, sourceport_id, destinationport_id, duration, distance, pricesingleway, priceroundway) VALUES (51, 51, 1, 30600.00, 510.00, 81.00, 162.00);INSERT INTO booking.state (id, fullname, shortname) VALUES (1, 'Alabama', 'AL');
INSERT INTO booking.state (id, fullname, shortname) VALUES (2, 'Alaska', 'AK');
INSERT INTO booking.state (id, fullname, shortname) VALUES (3, 'Arizona', 'AZ');
INSERT INTO booking.state (id, fullname, shortname) VALUES (4, 'Arkansas', 'AR');
INSERT INTO booking.state (id, fullname, shortname) VALUES (5, 'California', 'CA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (6, 'Colorado', 'CO');
INSERT INTO booking.state (id, fullname, shortname) VALUES (7, 'Conneticut', 'CT');
INSERT INTO booking.state (id, fullname, shortname) VALUES (8, 'Deleware', 'DE');
INSERT INTO booking.state (id, fullname, shortname) VALUES (9, 'District of Columbia', 'DC');
INSERT INTO booking.state (id, fullname, shortname) VALUES (10, 'Florida', 'FL');
INSERT INTO booking.state (id, fullname, shortname) VALUES (11, 'Georgia', 'GA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (12, 'Hawaii', 'HI');
INSERT INTO booking.state (id, fullname, shortname) VALUES (13, 'Idaho', 'ID');
INSERT INTO booking.state (id, fullname, shortname) VALUES (14, 'Illinois', 'IL');
INSERT INTO booking.state (id, fullname, shortname) VALUES (15, 'Indiana', 'IN');
INSERT INTO booking.state (id, fullname, shortname) VALUES (16, 'Iowa', 'IA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (17, 'Kansas', 'KS');
INSERT INTO booking.state (id, fullname, shortname) VALUES (18, 'Kentucky', 'KY');
INSERT INTO booking.state (id, fullname, shortname) VALUES (19, 'Lousiana', 'LA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (20, 'Maine', 'ME');
INSERT INTO booking.state (id, fullname, shortname) VALUES (21, 'Maryland', 'MD');
INSERT INTO booking.state (id, fullname, shortname) VALUES (22, 'Massachusetts', 'MA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (23, 'Michigan', 'MI');
INSERT INTO booking.state (id, fullname, shortname) VALUES (24, 'Minnesota', 'MN');
INSERT INTO booking.state (id, fullname, shortname) VALUES (25, 'Mississippo', 'MS');
INSERT INTO booking.state (id, fullname, shortname) VALUES (26, 'Missouri', 'MO');
INSERT INTO booking.state (id, fullname, shortname) VALUES (27, 'Montana', 'MT');
INSERT INTO booking.state (id, fullname, shortname) VALUES (28, 'Nebraska', 'NE');
INSERT INTO booking.state (id, fullname, shortname) VALUES (29, 'Nevada', 'NV');
INSERT INTO booking.state (id, fullname, shortname) VALUES (30, 'New Hampshire', 'NH');
INSERT INTO booking.state (id, fullname, shortname) VALUES (31, 'New Jersey', 'NJ');
INSERT INTO booking.state (id, fullname, shortname) VALUES (32, 'New Mexico', 'NM');
INSERT INTO booking.state (id, fullname, shortname) VALUES (33, 'New York', 'NY');
INSERT INTO booking.state (id, fullname, shortname) VALUES (34, 'North Carolina', 'NC');
INSERT INTO booking.state (id, fullname, shortname) VALUES (35, 'North Dakota', 'ND');
INSERT INTO booking.state (id, fullname, shortname) VALUES (36, 'Ohio', 'OH');
INSERT INTO booking.state (id, fullname, shortname) VALUES (37, 'Oklahoma', 'OK');
INSERT INTO booking.state (id, fullname, shortname) VALUES (38, 'Oregon', 'OR');
INSERT INTO booking.state (id, fullname, shortname) VALUES (39, 'Pennsylvania', 'PA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (40, 'Rhode Island', 'RI');
INSERT INTO booking.state (id, fullname, shortname) VALUES (41, 'South Carolina', 'SC');
INSERT INTO booking.state (id, fullname, shortname) VALUES (42, 'South Dakota', 'SD');
INSERT INTO booking.state (id, fullname, shortname) VALUES (43, 'Tennessee', 'TN');
INSERT INTO booking.state (id, fullname, shortname) VALUES (44, 'Texas', 'TX');
INSERT INTO booking.state (id, fullname, shortname) VALUES (45, 'Utah', 'UT');
INSERT INTO booking.state (id, fullname, shortname) VALUES (46, 'Vermont', 'VT');
INSERT INTO booking.state (id, fullname, shortname) VALUES (47, 'Virginia', 'VA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (48, 'Washington', 'WA');
INSERT INTO booking.state (id, fullname, shortname) VALUES (49, 'West Virginia', 'WV');
INSERT INTO booking.state (id, fullname, shortname) VALUES (50, 'Wisconsin', 'WI');
INSERT INTO booking.state (id, fullname, shortname) VALUES (51, 'Wyoming', 'WY');INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (4, 'T001', '2018-01-01 10:00:00', '2018-01-01 11:00:00', 'Fairfiled', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (5, 'T001', '2018-01-01 12:00:00', '2018-01-01 13:00:00', 'Fairfiled', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (6, 'T001', '2018-01-01 14:00:00', '2018-01-01 15:00:00', 'Fairfiled', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (7, 'T001', '2018-01-01 17:00:00', '2018-01-01 18:00:00', 'Fairfiled', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (8, 'T002', '2018-01-01 10:00:00', '2018-01-01 14:00:00', 'Chicago', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (9, 'T002', '2018-01-01 16:00:00', '2018-01-01 20:00:00', 'Chicago', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (10, 'T003', '2018-01-01 14:00:00', '2018-01-01 15:00:00', 'Chicago', 0, '');
INSERT INTO booking.train (trainid, name, model, madeby, type, capacity, status) VALUES (11, 'T003', '2018-01-01 17:00:00', '2018-01-01 18:00:00', 'Chicago', 0, '');INSERT INTO booking.user (id, username, password, customerid) VALUES (1, 'luatnguyen', '123', 1);
INSERT INTO booking.user (id, username, password, customerid) VALUES (2, 'kimtey', '123', 2);
INSERT INTO booking.user (id, username, password, customerid) VALUES (3, 'enkh', '123', 3);
INSERT INTO booking.user (id, username, password, customerid) VALUES (4, 'tam', '123', null);