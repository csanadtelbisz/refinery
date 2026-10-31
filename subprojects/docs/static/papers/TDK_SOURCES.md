# BME TDK collection sources

Checked on 2026-10-26 for the publication page proposed in
[upstream PR #92](https://github.com/graphs4value/refinery/pull/92).

## Scope

Eleven reports are included in `tdk.bib`. They concern Refinery, its VIATRA
Solver predecessor, partial-model processing, or closely related graph-generation
applications. The unrelated Telbisz example report from the original PR is removed.

New entries follow the PR's existing `@misc` / `type = {Report}` convention,
include the required conference/institution note, retain Hungarian portal
titles, and use BibTeX's `Family, Given` author form. Alternate titles visible
on downloaded reports are recorded separately rather than silently replacing
the portal title. `pagetotal` counts PDF pages, including front matter.

**The abstracts are exact source text; no `annote` fields or generated summaries
remain.** Ten are Hungarian abstracts from the official portal; Frey's English
abstract is taken from his report PDF. Per-entry sources and transcription notes
are in [ABSTRACT_SOURCES.md](ABSTRACT_SOURCES.md). `language` is included only
where the report establishes it; a Hungarian portal abstract may accompany an
English report.
PDF links are included only when a download link was found and opened.
No DOI is invented for an unregistered student report. Supervisor names are
stored separately from authors.

## Search method

The public archive was searched through the
[Marussy supervisor index](https://old.tdk.bme.hu/Browse/Users/Marussy-Kristof),
[Semeráth supervisor index](https://old.tdk.bme.hu/Browse/Users/Semerath-Oszkar2),
their year filters, and individual paper pages. The listing pages return at most
five papers at once, so the yearly lists and individual descriptions were used
to avoid treating the first page as a complete bibliography.

## Included reports

The year is verified from the archived conference/year listings. Titles,
authors, supervisors, and topic descriptions come from these paper pages:

| Key | Year | Portal record | Relevance |
| --- | --- | --- | --- |
| `bekoTdk2018` | 2018 | [Bekő](https://old.tdk.bme.hu/VIK/SW5/Grafmintailleszto-rendszerek-tesztelese) | Diverse graph/query generation for testing graph engines |
| `ficsorSomorjaiTdk2019` | 2019 | [Somorjai and Ficsor](https://old.tdk.bme.hu/VIK/intel/Tesztelrendezesek-automatikus-generalasa) | Qualitative traffic graphs followed by numeric concretization |
| `juhaszTdk2020` | 2020 | [Juhász](https://old.tdk.bme.hu/VIK/Software/Struktura-alapu-tesztkeszletek-vizualis) | VIATRA Solver visualization, metrics, and generation replay |
| `kilianTdk2020` | 2020 | [Kilián](https://old.tdk.bme.hu/VIK/neural2/Tesztgeneralas-relacios-mely-neuralis-halokhoz) | Qualitative graph generation and coverage for relational neural models |
| `foldiakTdk2020` | 2020 | [Földiák](https://old.tdk.bme.hu/VIK/info2/Graf-generalas-vizsgalata-az-extra) | Quantitative analysis of partial architectures during graph synthesis |
| `garamiGolejTdk2021` | 2021 | [Garami and Golej](https://old.tdk.bme.hu/VIK/sw7/Felhoalapu-4erteku-parcialis-modellezo) | Cloud-based four-valued partial-model transformations |
| `foldiakTdk2022` | 2022 | [Földiák](https://old.tdk.bme.hu/VIK/sw8/Graflekerdezesekkel-tamogatott-architektura) | Graph queries and decision diagrams in architecture synthesis |
| `baksaPappRuszkaTdk2023` | 2023 | [Baksa, Papp, and Ruszka](https://old.tdk.bme.hu/VIK/inform2/d15) | Propagation/inference rules and graph-processing performance |
| `radnotiTdk2023` | 2023 | [Radnóti](https://old.tdk.bme.hu/VIK/inteli2/Megosztott-allapotteru-tervezesiter-bejaro) | Persistent, shared graph state spaces for exploration |
| `szaboTdk2023` | 2023 | [Szabó](https://old.tdk.bme.hu/VIK/inform2/Parcialis-Modellek-Inkrementalis-Nezeti) | Explicit Refinery integration for incremental visualization |
| `freyTdk2023` | 2023 | [Frey](https://old.tdk.bme.hu/VIK/inteli2/Kontextusfuggo-Viselkedesek-Tesztelese) | Explicit Refinery integration for monitoring and guided generation |

Year-filter evidence:

- [Semeráth 2018](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2018)
- [Semeráth 2019](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2019)
- [Marussy 2020](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2020)
- [Marussy 2021](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2021)
- [Marussy 2022](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2022)
- [Marussy 2023](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2023)
- [Semeráth 2023](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2023)

## Coverage limitations and candidates for follow-up

The current [TDK portal](https://tdk.bme.hu/) returned no usable page text in the
available reader; its migrated 2024-and-later records could not be enumerated.
The archived Ficsor supervisor page timed out. Consequently, **this collection
does not establish exhaustive coverage**, especially for 2024–2026. The unrelated 2024 Telbisz example is removed.

The following reports were examined but are not added on the strength of a
shared supervisor alone. They remain candidates if a direct Refinery/VIATRA
Solver connection can be established from their implementation or full text:

- [Huszti, 2022: evaluation environment for visual relational reasoning](https://old.tdk.bme.hu/VIK/kepfel1/Kiertekelesi-kornyezet-kep-alapu-relacios).
- [Kovacsics, 2022: mechanical-model generation for machine learning](https://old.tdk.bme.hu/VIK/inteli1/Gepeszeti-modellek-automatikus-generalasa-gepi).
- [Ficsor and Pintér, 2021: simulation-based ADAS robustness testing](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2021).
- [Pintér and Puscsizna, 2023: genetic testing of lane-keeping systems](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2023).
- [Barta, 2014: abstract test data for autonomous and distributed systems](https://old.tdk.bme.hu/VIK/Informacios/Absztrakt-tesztadat-generalas-autonom-es),
  an earlier Alloy-based approach rather than an identified Refinery report.

The entries share the `publications-bibliography-audit-2026-10-31` branch
with `publications.bib` and `theses.bib`; no separate TDK branch is needed.

The new entries were parsed with Pandoc and checked for required fields,
distinct citation keys, valid URL syntax, and separate author/supervisor roles.
The PR's Docusaurus renderer was not previewed locally.
