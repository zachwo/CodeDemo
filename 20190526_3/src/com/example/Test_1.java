package com.example;

import com.example.entity.BDReport;
import com.example.entity.JavaReport;
import com.example.entity.Report;

public class Test_1 {
    public static void main(String[] args) {
        printReportResult(new JavaReport("JavaSE"));
        printReportResult(new BDReport("Linux"));
    }

    public static void printReportResult(Report report){
        report.target();
        report.process();
        report.result();
    }
}
