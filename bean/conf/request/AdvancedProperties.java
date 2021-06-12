package com.example.demo.bean.conf.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//<AdvancedProperties>
@XStreamAlias("AdvancedProperties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvancedProperties {
    //<TerminationCondition>AFTER_ALL_PARTIES_LEFT</TerminationCondition>
    @XStreamAlias("TerminationCondition")
    private String TerminationCondition;
    //<DurationAfterLeft>PT1M30S</DurationAfterLeft>
    @XStreamAlias("DurationAfterLeft")
    private String DurationAfterLeft;
}
