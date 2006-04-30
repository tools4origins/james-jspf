/***********************************************************************
 * Copyright (c) 1999-2006 The Apache Software Foundation.             *
 * All rights reserved.                                                *
 * ------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License"); you *
 * may not use this file except in compliance with the License. You    *
 * may obtain a copy of the License at:                                *
 *                                                                     *
 *     http://www.apache.org/licenses/LICENSE-2.0                      *
 *                                                                     *
 * Unless required by applicable law or agreed to in writing, software *
 * distributed under the License is distributed on an "AS IS" BASIS,   *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or     *
 * implied.  See the License for the specific language governing       *
 * permissions and limitations under the License.                      *
 ***********************************************************************/

package org.apache.spf.mechanismn;

import org.apache.spf.PermErrorException;
import org.apache.spf.SPF1Data;
import org.apache.spf.util.Inet6Util;

/**
 * This class represent the ip4 mechanism
 * 
 * @author Norman Maurer <nm@byteaction.de>
 * 
 */
public class IP6Mechanism extends IP4Mechanism {

    /**
     * ABNF: IP6 = "ip6" ":" ip6-network [ ip6-cidr-length ]
     */
    public static final String REGEX = "[iI][pP][6]"
            + "\\:([0-9A-Fa-f\\:\\.]+)" + "(?:" + IP6_CIDR_LENGTH_REGEX + ")?";

    /**
     * 
     * @see org.apache.spf.mechanismn.GenericMechanism#run(org.apache.spf.SPF1Data)
     */
    public boolean run(SPF1Data spfData) throws PermErrorException {
        // TODO
        throw new PermErrorException("Unimplemented");
    }

    protected boolean isValidAddress(String ipString) {
        return Inet6Util.isValidIP6Address(ipString);
    }

    protected int getMaxCidr() {
        return 128;
    }

}