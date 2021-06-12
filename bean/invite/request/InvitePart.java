package com.example.demo.bean.invite.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//<Invite_Part>
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("Invite_Part")
public class InvitePart {

    //<DialStr>420001@changhongit.com</DialStr>
    @XStreamAlias("DialStr")
    private String DialStr;
    //<PartName>LiuYi</PartName>\
    @XStreamAlias("PartName")
    private String PartName;
    //<ProtocolType>SIP</ProtocolType>
    @XStreamAlias("ProtocolType")
    private String ProtocolType;

}
//</Invite_Part>