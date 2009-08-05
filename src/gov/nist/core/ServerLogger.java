/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package gov.nist.core;

import java.util.Properties;

import javax.sip.SipStack;

import gov.nist.javax.sip.message.SIPMessage;

/**
 * @author jean.deruelle@gmail.com
 *
 */
public interface ServerLogger {
	/**
     * Dont trace
     */
    public static final int TRACE_NONE = 0;

    public static final int TRACE_MESSAGES = StackLogger.TRACE_MESSAGES;

    /**
     * Trace exception processing
     */
    public static final int TRACE_EXCEPTION = 17;

    /**
     * Debug trace level (all tracing enabled).
     */
    public static final int TRACE_DEBUG = 32;

    /**
     * TRACE trace level. ( stack traces included )
     */
    public static final int TRACE_TRACE = 64;

   
	 void closeLogFile();
	 
	 void logMessage(SIPMessage message, String from, String to, boolean sender, long time);
	 
	 void logMessage(SIPMessage message, String from, String to, String status,
	            boolean sender, long time);
	 
	 void logMessage(SIPMessage message, String from, String to, String status,
	            boolean sender);
	            	
	 void logException(Exception ex);
	 
	 public void setStackProperties(Properties stackProperties);
	 
	 public void setSipStack(SipStack sipStack);
}