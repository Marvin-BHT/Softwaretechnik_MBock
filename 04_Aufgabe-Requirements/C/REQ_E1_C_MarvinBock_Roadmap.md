# Roadmap

## Phasenübersicht

```
Phase 1 (MVP)     Phase 2           Phase 3
──────────────    ──────────────    ──────────────
Grundfunktionen   Automatisierung   Erweiterungen
Wochen 1–6        Wochen 7–12       Wochen 13–18
```

---

## Phase 1 – MVP (Wochen 1–6)

Ziel: Ein funktionierender Schichtplan, den ein Schichtleiter täglich nutzen kann.

### Meilenstein 1.1 – Projektsetup (Woche 1)
- Projektstruktur mit React + Vite + TypeScript aufsetzen
- Backend mit Node.js + Express initialisieren
- Datenbankschema mit Prisma + SQLite definieren (Mitarbeiter, Qualifikationen, Schichten, Teams)
- Docker Compose für lokales Deployment konfigurieren

### Meilenstein 1.2 – Stammdaten (Woche 2)
- Mitarbeiterverwaltung: Anlegen, bearbeiten, Qualifikationen zuweisen
- Qualifikationen definieren (Linienmechaniker, Vorarbeiter, Bediener)
- 4 Linienteams konfigurieren
- REST-API für Stammdaten (CRUD)

### Meilenstein 1.3 – Schichtplan-Grundgerüst (Wochen 3–4)
- Wochenübersicht: Alle Teams × alle Schichten in einer Tabelle
- Manuelle Zuweisung von Mitarbeitern zu Schichten per Drag & Drop oder Dropdown
- Validierung: Fehlende oder falsche Qualifikation wird visuell markiert
- Speichern und Laden von Schichtplänen

### Meilenstein 1.4 – Tagesansicht & Filter (Wochen 5–6)
- **Tagesansicht:** Übersicht des aktuellen Tages mit allen 3 Schichten und 4 Linienteams
- **Filter nach Position** (Linienmechaniker, Vorarbeiter, Bediener)
- **Filter nach Qualifikation**
- **Filter nach Linie** (Linie 1–4)
- Responsive Layout für Desktop-Browser

---

## Phase 2 – Automatisierung (Wochen 7–12)

Ziel: Die Software schlägt eigenständig valide Schichtpläne vor.

### Meilenstein 2.1 – Planungsalgorithmus (Wochen 7–9)
- Regelbasierte Scheduling Engine entwickeln
- Automatische Besetzung: 1 Linienmechaniker + 1 Vorarbeiter + 2 Bediener pro Team
- Qualifikationsprüfung und Konflikterkennung
- Gleichmäßige Verteilung von Früh-/Spät-/Nachtschichten

### Meilenstein 2.2 – Vorschlagssystem (Wochen 10–11)
- "Plan vorschlagen"-Button generiert einen vollständigen Wochenplan
- Schichtleiter kann Vorschlag annehmen, ablehnen oder anpassen
- Konflikte und Lücken werden farblich hervorgehoben

### Meilenstein 2.3 – Verfügbarkeiten (Woche 12)
- Mitarbeiter können Abwesenheiten/Urlaub hinterlegen
- Planungsalgorithmus berücksichtigt Verfügbarkeiten automatisch

---

## Phase 3 – Erweiterungen (Wochen 13–18)

Ziel: Komfort, Auswertung und Stabilität verbessern.

### Meilenstein 3.1 – Benachrichtigungen & Export (Wochen 13–14)
- Schichtplan als PDF exportieren
- Druckansicht für Aushang

### Meilenstein 3.2 – Auswertungen (Wochen 15–16)
- Stundenübersicht pro Mitarbeiter
- Schichtverteilung (Nachtschichtquote etc.)
- Einfaches Dashboard mit Kennzahlen

### Meilenstein 3.3 – Stabilität & Qualität (Wochen 17–18)
- Automatisierte Tests (Unit + Integrationstests)
- Performance-Optimierung bei größeren Datenmengen
- Benutzerfeedback einarbeiten
- Dokumentation für Endnutzer

---

## Backlog (zukünftige Ideen)

- Mehrsprachigkeit (DE/EN)
- Rollenkonzept (Admin, Schichtleiter, Nur-Lesen)
- Mobil-Ansicht für Mitarbeiter
- Anbindung an Zeiterfassungssystem
- Automatische E-Mail-Benachrichtigungen bei Planänderungen

---

## Status-Legende

| Symbol | Bedeutung |
|---|---|
| 🔲 | Geplant |
| 🔄 | In Bearbeitung |
| ✅ | Abgeschlossen |
