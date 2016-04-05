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

import java.util.*;

import org.eclipse.persistence.queries.*;

/**
* INTERNAL:
* org/eclipse/persistence/internal/remote/TransporterHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from d:/StarTeam/DIDev/Pine/TopLink/DISource/IDLs/CorbaRemoteSessionControllerSun.idl
* Thursday, May 3, 2001 1:36:59 PM EDT
*/
abstract public class TransporterHelper {
    private static String _id = "IDL:org/eclipse/persistence/internal/remote/Transporter:1.0";

    public static void insert(org.omg.CORBA.Any a, org.eclipse.persistence.internal.sessions.remote.Transporter that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static org.eclipse.persistence.internal.sessions.remote.Transporter extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    private static boolean __active = false;

    synchronized public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            synchronized (org.omg.CORBA.TypeCode.class) {
                if (__typeCode == null) {
                    if (__active) {
                        return org.omg.CORBA.ORB.init().create_recursive_tc(_id);
                    }
                    __active = true;
                    org.omg.CORBA.ValueMember[] _members0 = new org.omg.CORBA.ValueMember[0];
                    org.omg.CORBA.TypeCode _tcOf_members0 = null;
                    __typeCode = org.omg.CORBA.ORB.init().create_value_tc(_id, "Transporter", org.omg.CORBA.VM_NONE.value, null, _members0);
                    __active = false;
                }
            }
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    public static org.eclipse.persistence.internal.sessions.remote.Transporter read(org.omg.CORBA.portable.InputStream istream) {
        org.eclipse.persistence.internal.sessions.remote.Transporter value = new org.eclipse.persistence.internal.sessions.remote.Transporter();

        int length = istream.read_long();

        byte[] bytes = new byte[length];
        istream.read_octet_array(bytes, 0, length);

        java.io.ByteArrayInputStream byteIn = new java.io.ByteArrayInputStream(bytes);
        Object anObject = null;
        Map descriptors = null;
        DatabaseQuery query = null;
        if (bytes.length == 0) {
            return null;
        }
        try {
            java.io.ObjectInputStream objectIn = new java.io.ObjectInputStream(byteIn);
            anObject = objectIn.readObject();
            descriptors = (Map)objectIn.readObject();
            query = (DatabaseQuery)objectIn.readObject();

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        value.object = anObject;
        value.wasOperationSuccessful = istream.read_boolean();
        value.setQuery(query);
        value.setObjectDescriptors(descriptors);
        return value;
    }

    public static void write(org.omg.CORBA.portable.OutputStream ostream, org.eclipse.persistence.internal.sessions.remote.Transporter value) {
        java.io.ByteArrayOutputStream byteOut = new java.io.ByteArrayOutputStream();
        try {
            java.io.ObjectOutputStream objectOut = new java.io.ObjectOutputStream(byteOut);

            objectOut.writeObject(value.getObject());
            objectOut.writeObject(value.getObjectDescriptors());
            objectOut.writeObject(value.getQuery());

            objectOut.flush();
            ostream.write_long(byteOut.size());

            ostream.write_octet_array(byteOut.toByteArray(), 0, byteOut.size());

            ostream.write_boolean(value.wasOperationSuccessful);

        } catch (java.io.IOException exception) {
        }
    }
}
