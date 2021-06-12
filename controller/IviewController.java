package com.example.demo.controller;

import com.example.demo.bean.conf.request.AdvancedProperties;
import com.example.demo.bean.conf.request.Conference;
import com.example.demo.bean.conf.request.ScheduleConferenceRequest;
import com.example.demo.bean.invite.request.InvitePart;
import com.example.demo.bean.invite.request.InviteParticipantRequest;
import com.example.demo.entity.Invitepart;
import com.example.demo.service.InvitepartService;
import com.example.demo.service.IviewService;
import com.example.demo.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/iview")
public class IviewController {
    @Autowired
    private IviewService iviewService;
    @Autowired
    private InvitepartService invitepartService;

    @RequestMapping(value = "/c/{id}",method= RequestMethod.POST)
    @ResponseBody
    public String CreateMeeting(@PathVariable String id){
        System.out.println("创建会议"+id+"调用创建会议接口...");
        ScheduleConferenceRequest scheduleConferenceRequest = new ScheduleConferenceRequest();
        scheduleConferenceRequest.setRequestID(123456);
        Conference conference = new Conference();
        conference.setServicePrefix(71);
        conference.setMemberId(999);
        conference.setSubject("TestMeeting");
        conference.setNumber(6420007);
        conference.setStartTime(LocalDateTime.now());
        conference.setDuration("P0Y0M0DT1H30M15S");
        AdvancedProperties advancedProperties = new AdvancedProperties();
        advancedProperties.setTerminationCondition("AFTER_ALL_PARTIES_LEFT");
        advancedProperties.setDurationAfterLeft("PT1M30S");
        conference.setAdvancedProperties(advancedProperties);
        scheduleConferenceRequest.setConference(conference);

        String responseBodyAsString = iviewService.sendRequest(scheduleConferenceRequest);

        String Success = StringUtils.subString(responseBodyAsString, "<Success>", "</Success>");
        System.out.println(Success);
        String result=null;
        if (Success.equals("true")){
            String ConferenceId = StringUtils.subString(responseBodyAsString, "<ConferenceId>", "</ConferenceId>");
            System.out.println(ConferenceId);
            result=ConferenceId;
        }else {
            result="false";
        }

        return result;

    }

    @RequestMapping(value = "/i/{id}",method = RequestMethod.POST)
    @ResponseBody
    public String InviteMeeting(@PathVariable String id){
        int ConfGID = Integer.parseInt(id);
        System.out.println("发起会议"+id+"拉与会者入会接口");
        InviteParticipantRequest inviteParticipantRequest = new InviteParticipantRequest();
        inviteParticipantRequest.setRequestID(1234567890);
        inviteParticipantRequest.setConfGID(ConfGID);
//        InvitePart invitePart = new InvitePart();
//        invitePart.setDialStr("82505@changhongit.com");
//        invitePart.setPartName("sunhy");
//        invitePart.setProtocolType("SIP");
//        InvitePart invitePart1 = new InvitePart();
//        invitePart1.setDialStr("420001@changhongit.com");
//        invitePart1.setPartName("liuyi");
//        invitePart1.setProtocolType("SIP");
//        List<InvitePart> inviteParts=new ArrayList<>();
//        inviteParts.add(invitePart);
//        inviteParts.add(invitePart1);
        List<Invitepart> list = invitepartService.list();
        inviteParticipantRequest.setInviteParts(list);

        //String s = XmlUtils.beanToXml(inviteParticipantRequest);
        //System.out.println(s);

        String s = iviewService.sendRequest(inviteParticipantRequest);
        System.out.println(s);
        return "ok";
    }

}
