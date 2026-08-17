
```drawio-resource
../threat.drawio
```

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of threat modeling: assets, flows, trust boundaries, threats, actors, weaknesses, and taxonomies, structured around Shostack's four questions. It depends on and extends the [architecture model](https://architecture.models.nasdanika.org/), which in turn extends [work](https://work.models.nasdanika.org/) and [governance](https://governance.models.nasdanika.org/) models: threats elevate into the governance risk register, mitigations are governance controls, and "did we do a good job" is a governance assessment.

## Competitive landscape

The field splits into three camps, none of which occupies this model's position:

**Diagram-first tools.** [Microsoft Threat Modeling Tool](https://learn.microsoft.com/en-us/azure/security/develop/threat-modeling-tool) and [OWASP Threat Dragon](https://owasp.org/www-project-threat-dragon/) put a DFD editor in front and generate threats per element or interaction. Free and approachable, but the diagram is the model: no typed connection to a risk register, a control catalog, or the architecture the diagram depicts. The threat model is a document that starts rotting at export.

**Enterprise platforms.** IriusRisk, ThreatModeler, SD Elements. Threat libraries, rule engines, tracker integration, and increasingly LLM-assisted threat generation as a standard feature. Proprietary data models, per-seat pricing, and the same silo problem as GRC SaaS: the threat model lives in the platform, the architecture lives elsewhere, and the crosswalk between them is manual.

**Threat-modeling-as-code.** [pytm](https://github.com/OWASP/pytm) (system described in Python objects, threats and diagrams generated) and [Threagile](https://threagile.io/) (YAML architecture model, CI-native risk rules). Closest in spirit: the model is text, versioned, and generative. But the schemas are tool-private and flat; there is no metamodel to extend, no aspect composition, and the "architecture model" duplicates rather than references the real one. The emerging [CycloneDX TMBOM](https://cyclonedx.org/) interchange format, which Threat Dragon and pytm are both converging on, confirms the pain: models are locked in tools.

The actual competitor, as with governance, is the whiteboard photo and the spreadsheet that follows the workshop.

## What a typed model adds

**Threat modeling joins the risk register instead of duplicating it.** Every tool above maintains its own severity, status, and mitigation fields, disconnected from enterprise risk.
Here `Threat.risks` points into the governance model: a threat that survives analysis becomes a `Risk` with inherent and residual levels, its `mitigations` are `Control`s in the same catalog the compliance program runs on, and an accepted threat traces to a governance waiver.
Threat modeling becomes the demand side of the control catalog, which is precisely the connection auditors ask for and no tool provides.

**Methodologies are data.** STRIDE, LINDDUN, CAPEC, MITRE ATT&CK and ATLAS, OWASP Top 10 and LLM Top 10 load as `Taxonomy`/`ThreatCategory` catalogs, mirroring `Framework`/`Requirement` in governance.
A threat categorized in several taxonomies is a many-to-many reference, and the STRIDE-to-ATT&CK crosswalk is a query, not a mapping spreadsheet.

**The architecture is the threat model's substrate.** `Asset` extends the architecture model's `Element`: an asset *is* an architecture element, threat-modelable with no export step, and via the micro-model tower it is also workable, governed, staged, and access controlled. For standalone exercises, `Asset` plus `AssetKind` instance data (process, data store, external entity, model, dataset) gives the DFD vocabulary at the generic level without hard-coding DFD subclasses.

**Attack trees for free.** `Threat` contains `Threat`: root as goal, leaves as steps. No separate notation.

## Authoring: draw first, execute later

Draw.io is one authoring surface: DFD shapes map to `AssetKind`s and edges to `Flow`s via the [drawio model](https://drawio.models.nasdanika.org/), with marker keeping the trace back to each node.
Groovy DSL definitions act as prototypes carrying what a diagram cannot: documentation, role engagements, and default threats per kind (`AssetKind.defaultThreats` is the "every data store crossing a boundary gets tampering and information disclosure" rule engine, expressed as instance data rather than a proprietary rules format).
The workshop draws; the model accumulates.

## Applications

* **Educational.** 
* **Documentation generation.** 
* **Continuous threat modeling.** Because assets reference (or are) architecture elements, an architecture change is a model diff, and a model diff against `AssetKind.defaultThreats` is a list of new unanalyzed threats: the CI-native promise of threat-modeling-as-code, with the architecture model as the single source instead of a parallel YAML description.
* **Composition.** Agents, tools, and MCP servers from the [agent](https://agent.models.nasdanika.org/index.html) and [MCP](https://mcp.models.nasdanika.org/) models become assets.
* **Export.** TMBOM, Threat Dragon JSON, and pytm-style report formats are generated views, the same posture as OSCAL export in governance: interoperate with the tools without living in them.

## Model overview

| Area | Types |
|------|-------|
| Taxonomies | `Taxonomy`, `ThreatCategory` (hierarchical), `AssetKind` (with default threats) |
| What we work on | `Asset` (extends architecture `Element`), `Flow`, `TrustBoundary` |
| What can go wrong | `Threat` (attack tree via containment), `ThreatActor`, `Weakness`, `ThreatStatus` |
| What we do about it | governance `Control`, `Risk`, `Waiver` (reused, not redefined) |
| The exercise | `ThreatModel`, `Assumption` |
