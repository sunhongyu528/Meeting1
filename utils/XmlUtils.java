package com.example.demo.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class XmlUtils {
    private static XStream xStream;
    static {
        xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
        XStream.setupDefaultSecurity(xStream);
    }
    // java对象转xml
    public static String beanToXml(Object obj) {
        xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));//解决下划线问题
        xStream.processAnnotations(obj.getClass());
        String docmentString = "<?xml version='1.0' encoding='UTF-8'?>\n"
                + "<MCU_XML_API>\r\n"
                + "<Request>\r\n"
                + xStream.toXML(obj)
                + "</Request>\r\n"
                + "</MCU_XML_API>";
        return docmentString;
    }
}

