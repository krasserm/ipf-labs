/**
 * ConfluenceserviceV2SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.html.v2;

public class ConfluenceserviceV2SoapBindingStub extends org.apache.axis.client.Stub implements org.openehealth.ipf.labs.maven.confluence.export.html.v2.ConfluenceSoapService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[144];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSearchResult"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"), java.util.HashMap.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSearchResult"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChildren");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getChildrenReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteServerInfo"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteServerInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getServerInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getGroupsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAttachments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteAttachment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAttachmentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addAttachmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addAttachmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeAttachmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContentPermissionSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentPermissionSet"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContentPermissionSetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContentPermissionSets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteContentPermissionSet"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContentPermissionSetsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteComment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCommentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addCommentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeCommentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUser"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isPluginEnabled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "isPluginEnabledReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.AuthenticationFailedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AuthenticationFailedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getClusterInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteClusterInformation"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteClusterInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getClusterInformationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDescendents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getDescendentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAncestors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAncestorsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "logoutReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAttachmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUser"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRelatedLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRelatedLabelsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpaces");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpaceSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpacesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpaceGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceGroup"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpaceGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AlreadyExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpaceGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpaceGroup"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpaceGroupsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPagesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPagePermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePermission"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPagePermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setContentPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteContentPermission"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermission[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setContentPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "moveAttachmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "editCommentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTopLevelPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTopLevelPagesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAttachmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAttachmentDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isWatchingSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "isWatchingSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isWatchingPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "isWatchingPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTrashContents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummaries"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummaries.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTrashContentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyTrash");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "emptyTrashReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deactivateUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reactivateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "reactivateUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AlreadyExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecentlyUsedLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRecentlyUsedLabelsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecentlyUsedLabelsInSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRecentlyUsedLabelsInSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMostPopularLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMostPopularLabelsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMostPopularLabelsInSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getMostPopularLabelsInSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addUserToGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addUserToGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("installPlugin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "installPluginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPermissionsForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPermissionsForUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAllPermissionsForGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeAllPermissionsForGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeSpaceGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeSpaceGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRelatedLabelsInSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRelatedLabelsInSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpacesContainingContentWithLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpace"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpacesContainingContentWithLabelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpacesWithLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpace"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpacesWithLabelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLabelsByDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLabelsByDetailReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("movePageToTopLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "movePageToTopLevelReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renderContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "renderContentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renderContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"), java.util.HashMap.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "renderContentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exportSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "exportSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exportSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "exportSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeUserFromGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeUserFromGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableWysiwyg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setEnableWysiwygReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserGroupsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isPluginInstalled");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "isPluginInstalledReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPageSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPageSummaryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPageSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPageSummaryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPageHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageHistory"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPageHistoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("movePage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "movePageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removePageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storePage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "storePageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "VersionMismatchException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageUpdateOptions"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageUpdateOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updatePageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "VersionMismatchException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("purgeFromTrash");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "purgeFromTrashReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watchPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watchPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watchPageForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watchPageForUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("watchSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watchSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWatchersForPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteUser"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getWatchersForPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isWatchingSpaceForType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "isWatchingSpaceForTypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWatchersForSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteUser"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getWatchersForSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpacesInGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpaceSummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpacesInGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "storeSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSpaceGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceGroup"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceGroup"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addSpaceGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AlreadyExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPersonalSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addPersonalSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AlreadyExistsException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSpaceLevelPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getSpaceLevelPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPermissionToSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addPermissionToSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addGlobalPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addGlobalPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addGlobalPermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addGlobalPermissionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAnonymousUsePermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addAnonymousUsePermissionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAnonymousViewUserProfilePermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addAnonymousViewUserProfilePermissionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAnonymousViewUserProfilePermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeAnonymousViewUserProfilePermissionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeGlobalPermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeGlobalPermissionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPermissionsToSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addPermissionsToSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePermissionFromSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removePermissionFromSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUser"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "editUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isActiveUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "isActiveUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActiveUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getActiveUsersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeMyPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeMyPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeUserPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeUserPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUserInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUserInformation"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setUserInformationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUserInformation"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserInformationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUserPreferenceBoolean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setUserPreferenceBooleanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPreferenceBoolean");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserPreferenceBooleanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUserPreferenceLong");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setUserPreferenceLongReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPreferenceLong");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserPreferenceLongReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUserPreferenceString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setUserPreferenceStringReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPreferenceString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserPreferenceStringReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hasUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "hasUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hasGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "hasGroupReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addProfilePicture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addProfilePictureReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBlogEntryByDayAndTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntry"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getBlogEntryByDayAndTitleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBlogEntryByDateAndTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntry"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getBlogEntryByDateAndTitleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBlogEntry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntry"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getBlogEntryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBlogEntries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteBlogEntrySummary"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getBlogEntriesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("storeBlogEntry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntry"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntry"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "storeBlogEntryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "VersionMismatchException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exportSite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "exportSiteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("flushIndexQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "flushIndexQueueReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clearIndexQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "clearIndexQueueReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getClusterNodeStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteNodeStatus"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getClusterNodeStatusesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("importSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "importSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEnableAnonymousAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "setEnableAnonymousAccessReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLabelsById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLabelsByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLabelContentById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSearchResult"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLabelContentByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLabelContentByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSearchResult"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLabelContentByNameReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLabelContentByObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteLabel"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSearchResult"));
        oper.setReturnClass(org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLabelContentByObjectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLabelByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addLabelByNameReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLabelById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addLabelByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLabelByObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteLabel"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addLabelByObjectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLabelByNameToSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addLabelByNameToSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLabelByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeLabelByNameReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLabelById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeLabelByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLabelByObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteLabel"), org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeLabelByObjectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLabelByNameFromSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeLabelByNameFromSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAnonymousUsePermission");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeAnonymousUsePermissionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAnonymousPermissionToSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addAnonymousPermissionToSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAnonymousPermissionsToSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addAnonymousPermissionsToSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAnonymousPermissionFromSpace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "removeAnonymousPermissionFromSpaceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertWikiToStorageFormat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "convertWikiToStorageFormatReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "fault"),
                      "org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException",
                      new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException"), 
                      true
                     ));
        _operations[143] = oper;

    }

    public ConfluenceserviceV2SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfluenceserviceV2SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfluenceserviceV2SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "AbstractRemotePageSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.AbstractRemotePageSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntry");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntrySummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteClusterInformation");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteClusterInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentPermission");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentPermissionSet");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummaries");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummaries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteLabel");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteNodeStatus");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePage");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageHistory");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageUpdateOptions");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageUpdateOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePermission");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSearchResult");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteServerInfo");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteServerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceGroup");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUser");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUserInformation");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteAttachment");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteBlogEntrySummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteBlogEntrySummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteComment");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteComment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteContentPermission");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentPermission");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteContentPermissionSet");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentPermissionSet");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteContentSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteContentSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteLabel");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteLabel");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteNodeStatus");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteNodeStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageHistory");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageHistory");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePageSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePageSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemotePermission");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemotePermission");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSearchResult");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSearchResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpace");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpace");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpaceGroup");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteSpaceSummary");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteSpaceSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_tns2_RemoteUser");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteUser");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_anyType");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://confluence.atlassian.com/rpc/soap-axis/confluenceservice-v2", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AlreadyExistsException");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "AuthenticationFailedException");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.AuthenticationFailedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "InvalidSessionException");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "NotPermittedException");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "RemoteException");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rpc.confluence.atlassian.com", "VersionMismatchException");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "mapItem");
            cachedSerQNames.add(qName);
            cls = org.openehealth.ipf.labs.maven.confluence.export.html.v2.MapItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String[] getPermissions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[] search(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[] search(java.lang.String in0, java.lang.String in1, java.util.HashMap in2, int in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace getSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment getComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[] getChildren(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getChildren"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteServerInfo getServerInfo(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getServerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteServerInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteServerInfo) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteServerInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getGroups(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment[] getAttachments(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment addAttachment(java.lang.String in0, long in1, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment in2, byte[] in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment addAttachment(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment in1, byte[] in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeAttachment(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet getContentPermissionSet(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getContentPermissionSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet[] getContentPermissionSets(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getContentPermissionSets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermissionSet[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment[] getComments(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment addComment(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser getUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage getPage(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage getPage(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isPluginEnabled(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "isPluginEnabled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.AuthenticationFailedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.AuthenticationFailedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.AuthenticationFailedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteClusterInformation getClusterInformation(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getClusterInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteClusterInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteClusterInformation) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteClusterInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[] getDescendents(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getDescendents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[] getAncestors(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getAncestors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment getAttachment(java.lang.String in0, long in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2, new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteAttachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addUser(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getRelatedLabels(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getRelatedLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[] getSpaces(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpaces"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup getSpaceGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpaceGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup[] getSpaceGroups(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpaceGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[] getPages(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission[] getPagePermissions(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPagePermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePermission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setContentPermissions(java.lang.String in0, long in1, java.lang.String in2, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentPermission[] in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setContentPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean moveAttachment(java.lang.String in0, long in1, java.lang.String in2, long in3, java.lang.String in4) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "moveAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2, new java.lang.Long(in3), in4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment editComment(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "editComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[] getTopLevelPages(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getTopLevelPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getAttachmentData(java.lang.String in0, long in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getAttachmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2, new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isWatchingSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "isWatchingSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isWatchingPage(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "isWatchingPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummaries getTrashContents(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getTrashContents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummaries) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummaries) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteContentSummaries.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean emptyTrash(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "emptyTrash"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deactivateUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "deactivateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean reactivateUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "reactivateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace addSpace(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getRecentlyUsedLabels(java.lang.String in0, int in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getRecentlyUsedLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getRecentlyUsedLabelsInSpace(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getRecentlyUsedLabelsInSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getMostPopularLabels(java.lang.String in0, int in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getMostPopularLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Integer(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getMostPopularLabelsInSpace(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getMostPopularLabelsInSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addUserToGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addUserToGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean installPlugin(java.lang.String in0, java.lang.String in1, byte[] in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "installPlugin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getPermissionsForUser(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPermissionsForUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeAllPermissionsForGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeAllPermissionsForGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeSpaceGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeSpaceGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getRelatedLabelsInSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getRelatedLabelsInSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Integer(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[] getSpacesContainingContentWithLabel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpacesContainingContentWithLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[] getSpacesWithLabel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpacesWithLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getLabelsByDetail(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getLabelsByDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3, in4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean movePageToTopLevel(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "movePageToTopLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String renderContent(java.lang.String in0, java.lang.String in1, long in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "renderContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2), in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String renderContent(java.lang.String in0, java.lang.String in1, long in2, java.lang.String in3, java.util.HashMap in4) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "renderContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2), in3, in4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String exportSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "exportSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String exportSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "exportSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Boolean(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeUserFromGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeUserFromGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setEnableWysiwyg(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setEnableWysiwyg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Boolean(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getUserGroups(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getUserGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isPluginInstalled(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "isPluginInstalled"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary getPageSummary(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPageSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary getPageSummary(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPageSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory[] getPageHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getPageHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageHistory[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean movePage(java.lang.String in0, long in1, long in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "movePage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), new java.lang.Long(in2), in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removePage(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removePage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage storePage(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "storePage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage updatePage(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage in1, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePageUpdateOptions in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "updatePage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemotePage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean purgeFromTrash(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "purgeFromTrash"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean watchPage(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "watchPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean watchPageForUser(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "watchPageForUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean watchSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "watchSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[] getWatchersForPage(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getWatchersForPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isWatchingSpaceForType(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "isWatchingSpaceForType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[] getWatchersForSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getWatchersForSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[] getSpacesInGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpacesInGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace storeSpace(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "storeSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup addSpaceGroup(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addSpaceGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpaceGroup.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace addPersonalSpace(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addPersonalSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSpace.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.AlreadyExistsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getSpaceLevelPermissions(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getSpaceLevelPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addPermissionToSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addPermissionToSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addGlobalPermissions(java.lang.String in0, java.lang.String[] in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addGlobalPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addGlobalPermission(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addGlobalPermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addAnonymousUsePermission(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addAnonymousUsePermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addAnonymousViewUserProfilePermission(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addAnonymousViewUserProfilePermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeAnonymousViewUserProfilePermission(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeAnonymousViewUserProfilePermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeGlobalPermission(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeGlobalPermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addPermissionsToSpace(java.lang.String in0, java.lang.String[] in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addPermissionsToSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removePermissionFromSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removePermissionFromSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean editUser(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUser in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "editUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isActiveUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "isActiveUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getActiveUsers(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getActiveUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Boolean(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean changeMyPassword(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "changeMyPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean changeUserPassword(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "changeUserPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setUserInformation(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setUserInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation getUserInformation(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getUserInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteUserInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setUserPreferenceBoolean(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setUserPreferenceBoolean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Boolean(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean getUserPreferenceBoolean(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getUserPreferenceBoolean"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setUserPreferenceLong(java.lang.String in0, java.lang.String in1, java.lang.String in2, long in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setUserPreferenceLong"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, new java.lang.Long(in3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long getUserPreferenceLong(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getUserPreferenceLong"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setUserPreferenceString(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setUserPreferenceString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getUserPreferenceString(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getUserPreferenceString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean hasUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "hasUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean hasGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "hasGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addProfilePicture(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, byte[] in4) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addProfilePicture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3, in4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry getBlogEntryByDayAndTitle(java.lang.String in0, java.lang.String in1, int in2, java.lang.String in3) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getBlogEntryByDayAndTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), in3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry getBlogEntryByDateAndTitle(java.lang.String in0, java.lang.String in1, int in2, int in3, int in4, java.lang.String in5) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getBlogEntryByDateAndTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Integer(in2), new java.lang.Integer(in3), new java.lang.Integer(in4), in5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry getBlogEntry(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getBlogEntry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary[] getBlogEntries(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getBlogEntries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntrySummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry storeBlogEntry(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "storeBlogEntry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteBlogEntry.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.VersionMismatchException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String exportSite(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "exportSite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Boolean(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean flushIndexQueue(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "flushIndexQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean clearIndexQueue(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "clearIndexQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus[] getClusterNodeStatuses(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getClusterNodeStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteNodeStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean importSpace(java.lang.String in0, byte[] in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "importSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean setEnableAnonymousAccess(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "setEnableAnonymousAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Boolean(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[] getLabelsById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getLabelsById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[] getLabelContentById(java.lang.String in0, long in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getLabelContentById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[] getLabelContentByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getLabelContentByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[] getLabelContentByObject(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "getLabelContentByObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteSearchResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addLabelByName(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addLabelByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addLabelById(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addLabelById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addLabelByObject(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addLabelByObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addLabelByNameToSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addLabelByNameToSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeLabelByName(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeLabelByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeLabelById(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeLabelById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, new java.lang.Long(in1), new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeLabelByObject(java.lang.String in0, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteLabel in1, long in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeLabelByObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, new java.lang.Long(in2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeLabelByNameFromSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeLabelByNameFromSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.InvalidSessionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeAnonymousUsePermission(java.lang.String in0) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeAnonymousUsePermission"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addAnonymousPermissionToSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addAnonymousPermissionToSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addAnonymousPermissionsToSpace(java.lang.String in0, java.lang.String[] in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "addAnonymousPermissionsToSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeAnonymousPermissionFromSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "removeAnonymousPermissionFromSpace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.NotPermittedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String convertWikiToStorageFormat(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://soap.rpc.confluence.atlassian.com", "convertWikiToStorageFormat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) {
              throw (org.openehealth.ipf.labs.maven.confluence.export.html.v2.RemoteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
