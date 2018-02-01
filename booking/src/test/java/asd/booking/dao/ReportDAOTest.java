package asd.booking.dao;

import asd.booking.domain.Report;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class ReportDAOTest extends TestCase {

    public void testGetList() {
        List<Report> reportList = ReportDAO.getList("2017-01-01", "2018-12-31");
        Assert.assertNotNull(reportList);
        System.out.println(reportList.size());
    }
}