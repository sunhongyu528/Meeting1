package com.example.demo.bean.invite.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//<Invite_Participant_Request>
@Data
@AllArgsConstructor
@NoArgsConstructor
@XStreamAlias("Invite_Participant_Request")
public class InviteParticipantRequest {

    //<RequestID>1234567890</RequestID>
    @XStreamAlias("RequestID")
    private Integer RequestID;
    //<ConfGID>1384</ConfGID>
    @XStreamAlias("ConfGID")
    private Integer ConfGID;
    //<Invite_Part_List>
    @XStreamAlias("Invite_Part_List")
    private List<com.example.demo.entity.Invitepart> InviteParts;
    //<Invite_Part>
    //<DialStr>420001@changhongit.com</DialStr>
    //<PartName>LiuYi</PartName>
    //<ProtocolType>SIP</ProtocolType>
    //</Invite_Part>
    //
    //<Invite_Part>
    //<DialStr>82505@changhongit.com</DialStr>
    //<PartName>sunhy</PartName>
    //<ProtocolType>SIP</ProtocolType>
    //</Invite_Part>
    //
    //</Invite_Part_List>
    //</Invite_Participant_Request>
}
