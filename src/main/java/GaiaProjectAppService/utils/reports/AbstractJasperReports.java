package GaiaProjectAppService.utils.reports;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JRException;


import java.util.Map;
import java.sql.Connection;


public abstract class AbstractJasperReports {

    private static JasperReport report;
    private static JasperPrint reportFilled;
    private static JasperViewer viewer;


    public static void createReport (Connection connection, String reportPath, Map paremeters) {

        try {
            report = (JasperReport) JRLoader.loadObjectFromFile(reportPath);
            reportFilled = JasperFillManager.fillReport(report, null, connection);
        } catch(Exception IO) {

        }
    }

    public static void showViewer () {
        viewer = new JasperViewer(reportFilled);
        viewer.setVisible(true);
    }

    public static void exportToPDF (String destination) {
        try {
            JasperExportManager.exportReportToPdfFile(reportFilled, "");
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
}
