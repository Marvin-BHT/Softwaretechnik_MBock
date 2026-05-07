# Tech Stack

## Überblick

Die Anwendung ist eine lokal gehostete (On-Premise) Web-Applikation auf Basis von JavaScript/TypeScript. Sie wird ausschließlich im Intranet betrieben und erfordert keine Cloud-Anbindung.

---

## Frontend

| Technologie | Begründung |
|---|---|
| **React** (mit Vite) | Komponentenbasiert, weit verbreitet, ideal für interaktive Dashboards |
| **TypeScript** | Typsicherheit für komplexe Datenstrukturen (Teams, Schichten, Qualifikationen) |
| **Tailwind CSS** | Schnelles, konsistentes UI-Styling ohne aufwändiges CSS |
| **React Query** | Effizientes Daten-Fetching und State-Management für API-Daten |

---

## Backend

| Technologie | Begründung |
|---|---|
| **Node.js** | JavaScript-Basis, konsistent mit dem Frontend |
| **Express.js** | Schlankes REST-API-Framework, einfach zu betreiben |
| **TypeScript** | Gemeinsame Typdefinitionen zwischen Frontend und Backend möglich |

---

## Datenbank

| Technologie | Begründung |
|---|---|
| **SQLite** | Dateibasiert, keine separate Datenbankinstallation notwendig, ideal für On-Premise |
| **Prisma ORM** | Typsichere Datenbankzugriffe, einfache Migrationen |

> **Alternative:** Bei wachsenden Anforderungen kann SQLite problemlos durch PostgreSQL ersetzt werden, da Prisma beide unterstützt.

---

## Planungslogik / Automatisierung

| Technologie | Begründung |
|---|---|
| **Custom Scheduling Engine** (Node.js) | Regelbasierter Algorithmus zur automatischen Schichtplanung nach Qualifikationsregeln |

Regeln der Engine:
- Jedes Linienteam benötigt: 1 Linienmechaniker, 1 Vorarbeiter, 2 Bediener
- 4 Linienteams × 3 Schichten (Früh, Spät, Nacht)
- Qualifikationsprüfung vor jeder Zuweisung

---

## Deployment (On-Premise)

| Technologie | Begründung |
|---|---|
| **Docker + Docker Compose** | Einfaches lokales Setup, keine Abhängigkeiten auf dem Host |
| **Nginx** | Reverse Proxy für Frontend + Backend unter einem Port |

---

## Entwicklungswerkzeuge

| Tool | Zweck |
|---|---|
| **Vite** | Schneller Dev-Server und Build-Tool |
| **ESLint + Prettier** | Code-Qualität und einheitliche Formatierung |
| **Git** | Versionskontrolle |

---

## Architekturübersicht

```
Browser (Desktop)
      │
      ▼
  Nginx (Port 80)
      │
  ┌───┴────────────┐
  │                │
Frontend        Backend API
(React/Vite)   (Express.js)
                   │
               SQLite DB
              (Prisma ORM)
```
