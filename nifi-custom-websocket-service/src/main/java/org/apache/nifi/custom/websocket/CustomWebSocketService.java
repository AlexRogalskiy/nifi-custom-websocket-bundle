/**
 * (c) 2018 Hortonworks, Inc. All rights reserved.
 * <p>
 * This code is provided to you pursuant to your written agreement with Hortonworks, which may be the terms of the
 * Affero General Public License version 3 (AGPLv3), or pursuant to a written agreement with a third party authorized
 * to distribute this code.  If you do not have a written agreement with Hortonworks or with an authorized and
 * properly licensed third party, you do not have any rights to this code.
 * <p>
 * If this code is provided to you under the terms of the AGPLv3:
 * (A) HORTONWORKS PROVIDES THIS CODE TO YOU WITHOUT WARRANTIES OF ANY KIND;
 * (B) HORTONWORKS DISCLAIMS ANY AND ALL EXPRESS AND IMPLIED WARRANTIES WITH RESPECT TO THIS CODE, INCLUDING BUT NOT
 * LIMITED TO IMPLIED WARRANTIES OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE;
 * (C) HORTONWORKS IS NOT LIABLE TO YOU, AND WILL NOT DEFEND, INDEMNIFY, OR HOLD YOU HARMLESS FOR ANY CLAIMS ARISING
 * FROM OR RELATED TO THE CODE; AND
 * (D) WITH RESPECT TO YOUR EXERCISE OF ANY RIGHTS GRANTED TO YOU FOR THE CODE, HORTONWORKS IS NOT LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, PUNITIVE OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED
 * TO, DAMAGES RELATED TO LOST REVENUE, LOST PROFITS, LOSS OF INCOME, LOSS OF BUSINESS ADVANTAGE OR
 * UNAVAILABILITY, OR LOSS OR CORRUPTION OF DATA.
 */
package org.apache.nifi.custom.websocket;

import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.controller.AbstractControllerService;
import org.apache.nifi.controller.ConfigurationContext;
import org.apache.nifi.processor.Processor;
import org.apache.nifi.websocket.SendMessage;
import org.apache.nifi.websocket.WebSocketClientService;
import org.apache.nifi.websocket.WebSocketConfigurationException;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class CustomWebSocketService extends AbstractControllerService implements WebSocketClientService {

    @Override
    public void startClient(ConfigurationContext configurationContext) throws Exception {

    }

    @Override
    public void stopClient() throws Exception {

    }

    @Override
    public void connect(String s) throws IOException {

    }

    @Override
    public String getTargetUri() {
        return null;
    }

    @Override
    public void registerProcessor(String s, Processor processor) throws WebSocketConfigurationException {

    }

    @Override
    public boolean isProcessorRegistered(String s, Processor processor) {
        return false;
    }

    @Override
    public void deregisterProcessor(String s, Processor processor) throws WebSocketConfigurationException {

    }

    @Override
    public void sendMessage(String s, String s1, SendMessage sendMessage) throws IOException, WebSocketConfigurationException {

    }

    @Override
    protected List<PropertyDescriptor> getSupportedPropertyDescriptors() {
        return Collections.emptyList();
    }
}
