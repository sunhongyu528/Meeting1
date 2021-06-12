package com.example.demo.bean.conf.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


//<Conference>
@XStreamAlias("Conference")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conference {
    //<ServicePrefix>71</ServicePrefix>
    @XStreamAlias("ServicePrefix")
    private Integer ServicePrefix;
    //<MemberId>999</MemberId>
    @XStreamAlias("MemberId")
    private Integer MemberId;
    //<AdvancedProperties>
    @XStreamAlias("AdvancedProperties")
    private AdvancedProperties AdvancedProperties;
    //<TerminationCondition>AFTER_ALL_PARTIES_LEFT</TerminationCondition>
    //<DurationAfterLeft>PT1M30S</DurationAfterLeft>
    //</AdvancedProperties>
    //<Subject>Instant Conference- TestMeeting</Subject>
    @XStreamAlias("Subject")
    private String Subject;
    //<Number>6420007</Number>
    @XStreamAlias("Number")
    private Integer Number;
    //<StartTime>2021-06-11T12:20:50+08:00</StartTime>
    @XStreamAlias("StartTime")
    private LocalDateTime StartTime;
    //<Duration>P0Y0M0DT1H30M15S</Duration>
    @XStreamAlias("Duration")
    private String Duration;

}
//</Conference>