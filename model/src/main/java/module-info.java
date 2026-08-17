import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.threat.capability.ThreatArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.threat.capability.ThreatEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.threat.capability.ThreatResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.threat.capability.ThreatResourceFactoryCapabilityFactory;

module org.nasdanika.models.threat {
	
	exports org.nasdanika.models.threat;
	exports org.nasdanika.models.threat.impl;
	exports org.nasdanika.models.threat.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.architecture;
		
	provides CapabilityFactory with 
		ThreatEPackageResourceSetCapabilityFactory;
	
}