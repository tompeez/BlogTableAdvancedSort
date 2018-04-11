package de.hahn.blog.tableadvancedsort.view;

import oracle.adf.controller.TaskFlowId;

public class DynamicRegionBean {
    private String taskFlowId = "/WEB-INF/de/hahn/blog/advancedtablesort/view/employees/employee-btf.xml#employee-btf";

    public DynamicRegionBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public String employeebtf() {
        taskFlowId = "/WEB-INF/de/hahn/blog/advancedtablesort/view/employees/employee-btf.xml#employee-btf";
        return null;
    }

    public String departmentsbtf() {
        taskFlowId = "/WEB-INF/de/hahn/blog/advancedtablesort/view/departments/departments-btf.xml#departments-btf";
        return null;
    }
}
