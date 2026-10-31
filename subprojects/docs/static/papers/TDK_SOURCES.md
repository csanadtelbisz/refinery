# BME TDK collection sources

Checked on 2026-10-31 for the publication page proposed in
[upstream PR #92](https://github.com/graphs4value/refinery/pull/92).

## Scope and language policy

Three reports are included in `tdk.bib`. Their full text is verified as English.
They concern Refinery, its VIATRA Solver predecessor, partial-model processing,
or closely related graph-generation applications. The unrelated Telbisz example
report from the original PR is removed.

Titles are transcribed from the English report covers, not translated from the
Hungarian portal titles. In particular, the Baksa–Papp–Ruszka PDF's embedded
metadata has a different title; the printed cover supplies the title used here.
All three abstracts are the original English abstracts in those PDFs, with only
layout normalization and BibTeX escaping. There are no `annote` fields or generated
summaries. Per-entry sources are in [ABSTRACT_SOURCES.md](ABSTRACT_SOURCES.md).

As requested, reports confirmed to be written in Hungarian are excluded. For
reports without public full text, inclusion requires an English abstract on the
TDK portal. None of the five unverified reports below met that condition in the
accessible records. Their report language is not inferred from the Hungarian
abstract, and no English title or abstract has been invented for them.

Entries follow the PR's existing `@misc` / `type = {Report}` convention, include
the conference/institution note, and use BibTeX's `Family, Given` author form.
`pagetotal` counts all PDF pages, including front matter. PDF links were opened;
no DOI is invented for an unregistered student report. Supervisors are separate
from authors.

## Search method

The public archive was searched through the
[Marussy supervisor index](https://old.tdk.bme.hu/Browse/Users/Marussy-Kristof),
[Semeráth supervisor index](https://old.tdk.bme.hu/Browse/Users/Semerath-Oszkar2),
their year filters, and individual paper pages. The listing pages return at most
five papers at once, so the yearly lists and individual descriptions were used
to avoid treating the first page as a complete bibliography.

## Included reports

Years are verified from the archived conference/year listings. Authors and
supervisors are checked against the portal records and report covers.

| Key | Year | English cover title | Sources |
| --- | --- | --- | --- |
| `foldiakTdk2022` | 2022 | System Architecture Evaluation and Synthesis for Performability with Graph Queries | [Portal](https://old.tdk.bme.hu/VIK/sw8/Graflekerdezesekkel-tamogatott-architektura); [English report](https://old.tdk.bme.hu/VIK/DownloadPaper/Graflekerdezesekkel-tamogatott-architektura) |
| `baksaPappRuszkaTdk2023` | 2023 | Improving Graph-Based Reasoning: Automated Logic Propagation with Industrial Graph Processing Systems | [Portal](https://old.tdk.bme.hu/VIK/inform2/d15); [English report](https://old.tdk.bme.hu/VIK/DownloadPaper/d15) |
| `freyTdk2023` | 2023 | Testing Context Dependent Behaviours with Design-Space Exploration | [Portal](https://old.tdk.bme.hu/VIK/inteli2/Kontextusfuggo-Viselkedesek-Tesztelese); [English report](https://dominikfrey.dev/files/theses/tdk-2023-testing-context-dependent-behaviours-dse.pdf) |

Year-filter evidence:

- [Semeráth 2018](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2018)
- [Semeráth 2019](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2019)
- [Marussy 2020](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2020)
- [Marussy 2021](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2021)
- [Marussy 2022](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2022)
- [Marussy 2023](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Marussy-Kristof&y=2023)
- [Semeráth 2023](https://old.tdk.bme.hu/Browse/Papers?d=MIT&f=VIK&su=Semerath-Oszkar2&y=2023)

## Reports excluded by the language policy

These records remain here only as an audit trail; they are not in `tdk.bib`.

| Key | Record | Reason |
| --- | --- | --- |
| `bekoTdk2018` | [Portal](https://old.tdk.bme.hu/VIK/SW5/Grafmintailleszto-rendszerek-tesztelese) | Report PDF is written in Hungarian. |
| `ficsorSomorjaiTdk2019` | [Portal](https://old.tdk.bme.hu/VIK/intel/Tesztelrendezesek-automatikus-generalasa) | Report PDF is written in Hungarian. |
| `juhaszTdk2020` | [Portal](https://old.tdk.bme.hu/VIK/Software/Struktura-alapu-tesztkeszletek-vizualis) | No public report PDF was found; the accessible portal record has only a Hungarian abstract. No English portal abstract was found; report language is unverified. |
| `kilianTdk2020` | [Portal](https://old.tdk.bme.hu/VIK/neural2/Tesztgeneralas-relacios-mely-neuralis-halokhoz) | No public report PDF was found; the accessible portal record has only a Hungarian abstract. No English portal abstract was found; report language is unverified. |
| `foldiakTdk2020` | [Portal](https://old.tdk.bme.hu/VIK/info2/Graf-generalas-vizsgalata-az-extra) | Report PDF is written in Hungarian. |
| `garamiGolejTdk2021` | [Portal](https://old.tdk.bme.hu/VIK/sw7/Felhoalapu-4erteku-parcialis-modellezo) | No public report PDF was found; the accessible portal record has only a Hungarian abstract. No English portal abstract was found; report language is unverified. |
| `radnotiTdk2023` | [Portal](https://old.tdk.bme.hu/VIK/inteli2/Megosztott-allapotteru-tervezesiter-bejaro) | No public report PDF was found; the accessible portal record has only a Hungarian abstract. No English portal abstract was found; report language is unverified. |
| `szaboTdk2023` | [Portal](https://old.tdk.bme.hu/VIK/inform2/Parcialis-Modellek-Inkrementalis-Nezeti) | No public report PDF was found; the accessible portal record has only a Hungarian abstract. No English portal abstract was found; report language is unverified. |

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
