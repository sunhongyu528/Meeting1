package com.example.demo.bean.conf.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("Report")
public class Report {
//    <Success>true</Success>
    @XStreamAlias("Success")
    private Boolean Success;
//    <ConferenceId>1384</ConferenceId>
    @XStreamAlias("ConferenceId")
    private Integer ConferenceId;
//    <Number>6420007</Number>
    @XStreamAlias("Number")
    private Integer Number;
}
