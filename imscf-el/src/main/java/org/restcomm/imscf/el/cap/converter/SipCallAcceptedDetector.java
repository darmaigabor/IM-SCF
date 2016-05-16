/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011�2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */
package org.restcomm.imscf.el.cap.converter;

import org.restcomm.imscf.el.sip.SipMessageDetector;

import javax.servlet.sip.SipServletMessage;
import javax.servlet.sip.SipServletRequest;

/** Detector for checking whether the call was accepted. */
public class SipCallAcceptedDetector implements SipMessageDetector {
    private SipStatelessCallHandlingDetector stateless;
    private SipForwardedMessageDetector stateful;

    public SipCallAcceptedDetector(SipServletRequest invite) {
        stateless = new SipStatelessCallHandlingDetector(invite);
        stateful = new SipForwardedMessageDetector(invite);
    }

    @Override
    public boolean accept(SipServletMessage msg) {
        return stateless.accept(msg) || stateful.accept(msg);
    }

}