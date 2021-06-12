package com.example.demo.bean.conf.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//<Schedule_Conference_Request>

@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("Schedule_Conference_Request")
public class ScheduleConferenceRequest {
    @XStreamAlias("RequestID")
    //<RequestID> Request ID</RequestID>
    private Integer RequestID;
    //<Conference>
    @XStreamAlias("Conference")
    private Conference Conference;
}


