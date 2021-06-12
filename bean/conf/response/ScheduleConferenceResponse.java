package com.example.demo.bean.conf.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//     <Schedule_Conference_Response>
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("Schedule_Conference_Response")
public class ScheduleConferenceResponse {
//            <RequestID>111222</RequestID>
    @XStreamAlias("RequestID")
    private  Integer RequestID;
//            <ReturnValue>OK</ReturnValue>
    @XStreamAlias("ReturnValue")
    private String ReturnValue;
//            <Report>
    @XStreamAlias("Report")
    private Report Report;
//                <Success>true</Success>
//                <ConferenceId>1384</ConferenceId>
//                <Number>6420007</Number>
//            </Report>
//            <RecurringConfReport></RecurringConfReport>
    @XStreamAlias("RecurringConfReport")
    private String RecurringConfReport;
}
//        </Schedule_Conference_Response>