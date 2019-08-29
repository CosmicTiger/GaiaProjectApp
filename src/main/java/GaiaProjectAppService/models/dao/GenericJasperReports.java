package GaiaProjectAppService.models.dao;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public interface GenericJasperReports {
    static JasperReport report = null;
    static JasperPrint reportFilled = null;
    static JasperViewer viewer = null;
}
