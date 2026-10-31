# Publication collection sources

Checked on 2026-10-26 for [upstream PR #92](https://github.com/graphs4value/refinery/pull/92).

## Scope and conventions

`publications.bib` contains 33 papers: the two entries from the PR, the other
papers linked from the homepage and use-case cards, applications mentioned in
the MODELS 2024 tutorial, and related publications found through the authors'
lists. The collection includes the VIATRA Solver predecessor, partial-model
foundations, and applications of this research. A shared author alone is not a
reason for inclusion. Artifact versions and journal-first presentations are
linked to their paper rather than counted as additional publications.

The existing citation keys `jot2020` and `icse2024` are retained. The original
student thesis in the PR is retained as well.

**Editorial summaries are stored only in `annote`, not in `abstract`.** They are
paraphrases, not the authors' original abstracts. Original abstracts already
present in the PR are preserved. DOI and publisher/author links identify the source work.
Fields such as pagination, ISBN, PDF, and artifact links are included where
established by the sources below; unavailable values are omitted.

## Discovery sources

- Repository `README.md`, `subprojects/docs/src/pages/index.tsx`, and
  `subprojects/docs/src/components/UseCases/index.tsx`.
- [Refinery MODELS 2024 tutorial](https://refinery.tools/tutorials/models24.pdf),
  especially the applications slide and bibliography.
- [Kristóf Marussy's publication list](https://marussy.com/) and
  [DBLP bibliography](https://dblp.org/pid/130/6479.html).
- [Oszkár Semeráth's publication list](https://oszkarsemerath.github.io/publications)
  and [DBLP bibliography](https://dblp.org/pid/134/9441.html).
- [Aren A. Babikian's DBLP bibliography](https://dblp.org/pid/242/3911.html).
- [Dániel Varró's DBLP bibliography](https://dblp.org/pid/53/1883.html).
- [Gunter Mussbacher's supervised work](https://www.ece.mcgill.ca/~gmussb1/students.htm)
  and [publications](https://www.ece.mcgill.ca/~gmussb1/publications.htm), for
  follow-up papers by the same research collaborators.
- [Dominik Frey's research and publications](https://dominikfrey.dev/academic),
  for recent maritime applications following the Refinery-based BME work.

## Record sources and connection to Refinery

DOI links below identify the corresponding publisher records. Author copies are
also linked in the BibTeX when verified.

| Citation key | Source | Connection |
| --- | --- | --- |
| `icse2024` | [ICSE Companion 2024](https://doi.org/10.1145/3639478.3640045) | Refinery tool demonstration |
| `jot2020` | [JOT 2020](https://doi.org/10.5381/jot.2020.19.3.a12) | Partial-model specification language |
| `semerathNagyVarro2018` | [ICSE 2018](https://doi.org/10.1145/3180155.3180186) | Dedicated graph solver |
| `marussyMultiplicity2022` | [TSE 2022](https://doi.org/10.1109/TSE.2020.3025732) | Multiplicity reasoning and scopes |
| `babikianQualitative2022` | [SoSyM 2022](https://doi.org/10.1007/s10270-021-00918-6) | Combined graph and attribute reasoning |
| `semerathDiversity2020` | [STTT 2020](https://doi.org/10.1007/s10009-019-00530-6) | Graph diversity and mutation testing |
| `semerathRealistic2021` | [SoSyM 2021](https://doi.org/10.1007/s10270-021-00884-z) | Consistent, diverse, realistic generation |
| `varroGraphGeneration2018` | [Graph Transformation, Specifications, and Nets](https://doi.org/10.1007/978-3-319-75396-6_16) | Foundations and correctness arguments |
| `burWitness2021` | [TECS 2021](https://doi.org/10.1145/3471904) | Witness generation; linked by the website's WCET card |
| `foldiakPerformability2022` | [MODELS 2022](https://doi.org/10.1145/3550355.3552448) | Architecture synthesis; linked by a use-case card |
| `chenSceneGraphs2022` | [ASE 2022](https://doi.org/10.1145/3551349.3560433) | Consistency constraints for scene graphs |
| `chenGameMaps2020` | [MODELS Companion 2020](https://doi.org/10.1145/3417990.3422001) | Game-map generation; linked by a use-case card |
| `semerathAttributes2020` | [MODELS 2020](https://doi.org/10.1145/3365438.3410962) | Structural and attribute constraints |
| `babikianTheoremProvers2020` | [FASE 2020](https://doi.org/10.1007/978-3-030-45234-6_22) | Related first-order solver backend |
| `semerathViatraSolver2019` | [ICSE Companion 2019](https://doi.org/10.1109/ICSE-Companion.2019.00034) | Predecessor tool |
| `marussyViews2018` | [MODELS 2018](https://doi.org/10.1145/3239372.3239412) | Incremental transformations over partial models |
| `semerathDiverse2018` | [FASE 2018](https://doi.org/10.1007/978-3-319-89363-1_13) | Neighborhood diversity and iterative generation |
| `semerathConstraintRewriting2017` | [ICMT 2017](https://doi.org/10.1007/978-3-319-61473-1_10) | Partial-model query semantics |
| `semerathIncomplete2017` | [Acta Cybernetica 2017](https://doi.org/10.14232/actacyb.23.2.2017.15) | May/must validation of incomplete models |
| `semerathIncremental2016` | [FASE 2016](https://doi.org/10.1007/978-3-662-49665-7_6) | Earlier iterative synthesis |
| `majzikCoverage2019` | [MODELS 2019](https://doi.org/10.1109/MODELS.2019.00-12) | Graph-generated situations and coverage |
| `alGburiLedger2024` | [MODELS 2024](https://doi.org/10.1145/3640310.3674097) | Refinery application identified in tutorial slides |
| `lopezText2VQL2024` | [MODELS 2024](https://doi.org/10.1145/3640310.3674091) | Refinery application identified in tutorial slides |
| `kargenCOLREGS2024` | [MODELS 2024](https://doi.org/10.1145/3640310.3674098) | Refinery application identified in tutorial slides |
| `babikianConcretization2024` | [TSE 2024](https://doi.org/10.1109/TSE.2023.3331254) | Concretization following qualitative graph synthesis |
| `babikianJunctions2026` | [SoSyM 2026](https://doi.org/10.1007/s10270-026-01372-y) | Related multi-level traffic-scenario generation |
| `foldiakProbabilistic2026` | [SoSyM 2026](https://doi.org/10.1007/s10270-025-01331-z) | Related graph-query architecture analysis |
| `tothSysML2026` | [MODELS 2026](https://doi.org/10.1145/3822455.3830322), [artifact](https://zenodo.org/records/19291629) | Explicit Refinery-based SysML v2 validator |
| `freyAssurance2026` | [MODELS 2026](https://doi.org/10.1145/3822455.3830315), [author description](https://dominikfrey.dev/a/models-2026-functionally-complete-assurance-suites) | Maritime graph solving and multi-step refinement |
| `freySceneGEMS2026` | [MODELS Companion 2026](https://doi.org/10.1145/3837062.3838872), [author PDF](https://dominikfrey.dev/files/papers/models-2026-scenegems-tool-paper.pdf) | Integrated scenario generation and execution |
| `freyCOLREGSEvaluation2025` | [ISSTA 2025](https://doi.org/10.1145/3728919) | Supporting evaluation of maritime scenario generators |
| `akelDataSpaces2026` | [SAC 2026](https://doi.org/10.1145/3748522.3779965), [MTMT record](https://m2.mtmt.hu/gui2/?mode=browse&params=publication%3B37333466) | Related constraint-compliant synthetic data generation |
| `akelDataQuality2025` | [BME publisher PDF](https://repozitorium.omikk.bme.hu/bitstreams/3720cd9a-899e-437c-8642-cc7bf84fdf3d/download), [DOI](https://doi.org/10.3311/MINISY2025-010), [MTMT record](https://m2.mtmt.hu/gui2/?mode=browse&params=publication%3B36133680) | Explicit application of Refinery to xAPI data-quality validation |

## Thesis sources and date decisions

- `semerathPhd2019`: [author's dissertation](https://oszkarsemerath.github.io/content/phd-thesis-semerath.pdf)
  and [BME publication record](https://inf.mit.bme.hu/user/1387/biblio).
- `marussyPhd2023`: [dissertation](https://marussy.com/phd-thesis.pdf).
  The dissertation cover says **2023**; the separately linked booklet says 2024.
- `freyMsc2023`: [dissertation](https://dominikfrey.dev/files/theses/msc-thesis-2023-complex-event-processing-dse.pdf).
  Use its cover date, **2023-12-17**, rather than the 2024 graduation year.
- `babikianPhd2024`: [McGill defence announcement](https://www.mcgill.ca/ece/channels/event/phd-defence-aren-babikian-system-level-testing-autonomous-vehicles-through-consistent-model-358492),
  [author's CV](https://www.arenbabikian.com/cv/aren-a-babikian-cv.pdf), and
  [supervisor's list](https://www.ece.mcgill.ca/~gmussb1/students.htm).
  These identify the work as a 2024 PhD. The [Érudit catalogue](https://www.erudit.org/en/theses/mcgill/B/?page=2&sort_by=date_desc)
  lists it in 2025; the difference is recorded in `note`. Its linked repository
  download returned HTTP 403, so no PDF URL is asserted.

Journal citations use issue years when assigned: the multiplicity paper is
2022 (online in 2020), the qualitative-abstraction paper is 2022 (online in 2021),
and probabilistic graph-query evaluation is 2026 (online in 2025).
The junction-scenario paper is online in 2026 without volume or pagination in
the publisher record consulted. The published journal version is listed once;
the earlier arXiv version is an additional link.

## Metadata audit

The follow-up audit corrected the following draft metadata:

- `foldiakPerformability2022`: pages **43–54**, not 433–445. Confirmed by the
  [BME MTMT record](https://m2.mtmt.hu/api/publication?cond=authors%3Beq%3B10001448&format=html&labelLang=hun&page=2&sort=publishedYear%2Cdesc)
  and the paper's 12-page author copy. The author's homepage contained the
  misleading abbreviated range. The PDF also establishes ISBN 978-1-4503-9466-6.
- `burWitness2021`: record the article-number pagination **107:1–107:36**,
  established by the [DBLP journal volume](https://einstein.dagstuhl.de/db/journals/tecs/tecs20.html).
- Generated summaries are removed from every new `abstract` field and retained
  as explicitly editorial annotations. They must not be described as author
  abstracts or copied into that field without a verified original.
- TDK languages are recorded only where the downloaded report establishes the
  language. A Hungarian portal description does not establish the PDF language.
- Alternative PDF titles are annotations, not additions to the citation title.
- Added `akelDataQuality2025` after finding a BME publisher PDF that explicitly
  identifies Refinery as the implementation. The DOI is printed on page 51;
  the BME MTMT catalogue establishes year, editor, venue, and pages 51–54.

This verifies bibliographic identity and source-supported fields; it does not
certify that every source is free of errors. Publication dates conflicting
between an online release and an assigned issue are documented above, and the
Babikian defence/catalogue year discrepancy remains explicit.

All three existing BibTeX files belong to the same `publications` PR branch.
The TDK and thesis additions do not require separate PRs.

## Validation and remaining limitations

All three BibTeX files were parsed with Pandoc's BibTeX reader. Citation keys,
DOIs, required metadata, and coverage of the website's explicit DOI references
were checked. A complete Docusaurus/Citation.js preview was not run: the local
checkout predates the PR's renderer and its dependencies, and the execution
environment's HTTP proxy was unavailable.

This is a sourced collection, not a claim that all future or unindexed work has
been found. Original-author abstracts unavailable in the collected metadata are
omitted, rather than synthesized. Additional student theses can be
found through the BME supervisors' catalogues; only the four independently
identified theses above are added here. TDK coverage and access limitations are
documented in the adjacent `TDK_SOURCES.md`.
