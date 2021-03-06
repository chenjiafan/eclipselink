/*******************************************************************************
 * Copyright (c) 1998, 2013 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/  
package org.eclipse.persistence.sessions.remote.corba.sun;


/**
* INTERNAL:
* org/eclipse/persistence/remote/corba/sun/_CORBARemoteSessionControllerImplBase.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from d:/StarTeam/DIDev/Pine/TopLink/DISource/IDLs/CorbaRemoteSessionControllerSun.idl
* Thursday, May 3, 2001 1:36:59 PM EDT
*/
public abstract class _CORBARemoteSessionControllerImplBase extends org.omg.CORBA.portable.ObjectImpl implements org.eclipse.persistence.sessions.remote.corba.sun.CORBARemoteSessionController, org.omg.CORBA.portable.InvokeHandler {
    // Constructors
    public _CORBARemoteSessionControllerImplBase() {
    }

    private static java.util.Hashtable _methods = new java.util.Hashtable();

    static {
        _methods.put("getLogin", new java.lang.Integer(2));
        _methods.put("scrollableCursorCurrentIndex", new java.lang.Integer(5));
        _methods.put("commitRootUnitOfWork", new java.lang.Integer(6));
        _methods.put("scrollableCursorAbsolute", new java.lang.Integer(8));
        _methods.put("cursoredStreamNextPage", new java.lang.Integer(10));
        _methods.put("executeQuery", new java.lang.Integer(14));
        _methods.put("scrollableCursorFirst", new java.lang.Integer(15));
        _methods.put("scrollableCursorAfterLast", new java.lang.Integer(18));
        _methods.put("cursoredStreamClose", new java.lang.Integer(19));
        _methods.put("getSequenceNumberNamed", new java.lang.Integer(22));
        _methods.put("scrollableCursorClose", new java.lang.Integer(24));
        _methods.put("processCommand", new java.lang.Integer(25));
        _methods.put("cursorSelectObjects", new java.lang.Integer(27));
        _methods.put("scrollableCursorLast", new java.lang.Integer(29));
        _methods.put("executeNamedQuery", new java.lang.Integer(31));
        _methods.put("scrollableCursorBeforeFirst", new java.lang.Integer(33));
        _methods.put("scrollableCursorIsBeforeFirst", new java.lang.Integer(34));
        _methods.put("beginTransaction", new java.lang.Integer(35));
        _methods.put("initializeIdentityMapsOnServerSession", new java.lang.Integer(36));
        _methods.put("scrollableCursorIsLast", new java.lang.Integer(37));
        _methods.put("scrollableCursorSize", new java.lang.Integer(38));
        _methods.put("scrollableCursorIsFirst", new java.lang.Integer(39));
        _methods.put("getDescriptor", new java.lang.Integer(40));
        _methods.put("cursoredStreamSize", new java.lang.Integer(41));
        _methods.put("scrollableCursorRelative", new java.lang.Integer(42));
        _methods.put("commitTransaction", new java.lang.Integer(45));
        _methods.put("rollbackTransaction", new java.lang.Integer(47));
        _methods.put("instantiateRemoteValueHolderOnServer", new java.lang.Integer(52));
        _methods.put("scrollableCursorNextObject", new java.lang.Integer(53));
        _methods.put("scrollableCursorIsAfterLast", new java.lang.Integer(54));
        _methods.put("getDefaultReadOnlyClasses", new java.lang.Integer(56));
        _methods.put("scrollableCursorPreviousObject", new java.lang.Integer(57));
        _methods.put("getDescriptorForAlias", new java.lang.Integer(58));
        _methods.put("beginEarlyTransaction", new java.lang.Integer(59));
    }

    public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream in, org.omg.CORBA.portable.ResponseHandler rh) {
        org.omg.CORBA.portable.OutputStream out = null;
        java.lang.Integer __method = (java.lang.Integer)_methods.get(method);
        if (__method == null) {
            throw new org.omg.CORBA.BAD_OPERATION(0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        }

        switch (__method.intValue()) {
        case 2:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/getLogin
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.getLogin();
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 5:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorCurrentIndex
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorCurrentIndex(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 6:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/commitRootUnitOfWork
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.commitRootUnitOfWork(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 8:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorAbsolute
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            int arg1 = in.read_long();
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorAbsolute(arg0, arg1);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 10:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/cursoredStreamNextPage
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            int arg1 = in.read_long();
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.cursoredStreamNextPage(arg0, arg1);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 14:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/executeQuery
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.executeQuery(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 15:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorFirst
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorFirst(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 18:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorAfterLast
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorAfterLast(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 19:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/cursoredStreamClose
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.cursoredStreamClose(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 22:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/getSequenceNumberNamed
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.getSequenceNumberNamed(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 24:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorClose
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorClose(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 25:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/processCommand
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.processCommand(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 27:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/cursorSelectObjects
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.cursorSelectObjects(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 29:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorLast
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorLast(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 31:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/executeNamedQuery
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter arg1 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter arg2 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.executeNamedQuery(arg0, arg1, arg2);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 33:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorBeforeFirst
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorBeforeFirst(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 34:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorIsBeforeFirst
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorIsBeforeFirst(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 35:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/beginTransaction
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.beginTransaction();
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 36:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/initializeIdentityMapsOnServerSession
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.initializeIdentityMapsOnServerSession();
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 37:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorIsLast
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorIsLast(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 38:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorSize
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorSize(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 39:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorIsFirst
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorIsFirst(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 40:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/getDescriptor
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.getDescriptor(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 41:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/cursoredStreamSize
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.cursoredStreamSize(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 42:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorRelative
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            int arg1 = in.read_long();
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorRelative(arg0, arg1);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 45:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/commitTransaction
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.commitTransaction();
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 47:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/rollbackTransaction
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.rollbackTransaction();
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 52:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/instantiateRemoteValueHolderOnServer
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.instantiateRemoteValueHolderOnServer(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 53:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorNextObject
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorNextObject(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 54:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorIsAfterLast
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorIsAfterLast(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 56:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/getDefaultReadOnlyClasses
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.getDefaultReadOnlyClasses();
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 57:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/scrollableCursorPreviousObject
         {
            org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
            org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
            __result = this.scrollableCursorPreviousObject(arg0);
            out = rh.createReply();
            org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
            break;
        }
        case 58:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/getDescriptorForAlias
        {
           org.eclipse.persistence.internal.sessions.remote.Transporter arg0 = org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.read(in);
           org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
           __result = this.getDescriptorForAlias(arg0);
           out = rh.createReply();
           org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
           break;
       }
        case 59:// org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController/beginEarlyTransaction
        {
           org.eclipse.persistence.internal.sessions.remote.Transporter __result = null;
           __result = this.beginEarlyTransaction();
           out = rh.createReply();
           org.eclipse.persistence.sessions.remote.corba.sun.TransporterHelper.write(out, __result);
           break;
       }
        default:
            throw new org.omg.CORBA.BAD_OPERATION(0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        }

        return out;
    }
    // _invoke

    // Type-specific CORBA::Object operations
    private static String[] __ids = { "IDL:org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController:1.0" };

    public String[] _ids() {
        return __ids;
    }
}// class _CORBARemoteSessionControllerImplBase
