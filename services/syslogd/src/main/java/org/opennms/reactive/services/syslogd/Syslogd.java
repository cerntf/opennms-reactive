/**
 * 
 */
package org.opennms.reactive.services.syslogd;

import org.opennms.reactive.daemon.AbstractServiceDaemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tf016851
 *
 */
public class Syslogd extends AbstractServiceDaemon {
    
    private static final Logger LOG = LoggerFactory.getLogger(Syslogd.class);

    public Syslogd(String m_name) {
        super(m_name);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.opennms.reactive.daemon.AbstractServiceDaemon#onInit()
     */
    @Override
    protected void onInit() {
        // TODO Auto-generated method stub

    }

    /**
     * <p>onStart</p>
     */
    @Override
    protected void onStart() {
        
    }
}
