package de.hahn.blog.tableadvancedsort.view.employees;

import java.util.List;

import javax.faces.context.FacesContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.adf.view.rich.component.rich.data.RichTable;

import org.apache.myfaces.trinidad.event.SortEvent;
import org.apache.myfaces.trinidad.event.SortListener;
import org.apache.myfaces.trinidad.model.SortCriterion;

public class EmployeesSearchBean {
    private static ADFLogger logger = ADFLogger.createADFLogger(EmployeesSearchBean.class);

    public EmployeesSearchBean() {
    }

    public void sortTableListener(SortEvent sortEvent) {
        List<SortCriterion> criteria = sortEvent.getSortCriteria();
        for (SortCriterion sc : criteria) {
            logger.info("Sort after: " + sc.getProperty());
        }
        // Create new SortCriterion for LastName in asending order
        SortCriterion scNew = new SortCriterion("LastName", true);
        // Add it to the list
        criteria.add(scNew);
        // abd apply it back to the table
        Object object = sortEvent.getSource();
        RichTable table = (RichTable) object;
        table.setSortCriteria(criteria);
        logger.info("----------------------END----------------------");
    }
}
