# Requirements Gathering
---

### Functional Requirements

| Feature                            | Req No. | Requirements                                                                                                      |
|------------------------------------|---------|------------------------------------------------------------------------------------------------------------------|
| 🔐 **User Access and Role Management** | F01     | When multiple users log into the Gemini OCS, the system shall provide secure and privilege-based access to any telescope. |
|                                    | F02     | When a user logs into the Gemini OCS, the system shall allow them to perform tasks based on their specific role and access level (Astronomer: submits and validates science plans; Science Observer: executes and monitors observing programs; Telescope Operator: indirectly controls the telescope; Support Personnel: performs maintenance and troubleshooting; Developer: installs and debugs software; Administrator: manages system configurations and scheduling). |
|                                    | F03     | When users with appropriate access roles are logged in, the system shall provide remote access and monitoring capabilities based on the permissions assigned to their role. |
| 🔭 **Observation Control and Operation** | F04     | The system shall support the interactive operation of the Gemini 8m Telescopes exclusively through the Observatory Control System (OCS). |
|                                    | F05     | The system shall support restricting specific operations to designated remote sites.                             |
|                                    | F06     | When sequences are observed, the Gemini OCS shall automate the observation and shall allow interactive options when necessary. |
|                                    | F07     | When scheduling tasks and observing commands, the Gemini OCS shall use a queue-based approach.                   |
|                                    | F08     | While planned downtime, The system’s functions such as monitoring and data retrieval shall remain accessible.      |
|                                    | F09     | The Gemini OCS shall provide real-time data on quality assessment, performance, and collected data.             |
| 🌌 **Science Planning and Execution** | F10     | The Gemini OCS shall allow astronomers to create, test, and submit science plans, collect data, and validate its quality. |
|                                    | F11     | When a science plan is submitted, the Gemini OCS shall allow science observers to validate science plans.         |
|                                    | F12     | The system shall allow the tools for science observers to review and adjust observing programs.                  |
|                                    | F13     | The system shall allow Astronomer users to simulate telescope behavior.                                          |
| ⚠️ **Failure Management**           | F14     | The system shall generate and display a real-time alert to administrators when a system failure occurs.           |
|                                    | F15     | The system shall categorize errors by severity (fatal, serious, and warning).                                    |
| 📄 **Report Management**            | F16     | When an observation is completed, the system shall generate a report with key details (observation summaries, including targets, exposure times, instrument configurations, and data quality metrics). |
|                                    | F17     | When an astronomer, science observer, or administrator requests operational information, the system shall provide real-time and historical reports on the telescope's status. |
|                                    | F18     | The system shall allow report access based on the user’s role.                                                   |
|                                    | F19     | When administrators request financial data, the system shall generate the financial reports (usage and cost analysis). |
|                                    | F20     | The system shall allow users to export the reports in standard format (CSV, PDF).                               |
| 🛠️ **Testing and Maintenance**      | F21     | The system shall allow users at the observing level to perform a certain number of embedded tests.              |
|                                    | F22     | The system shall allow users at the maintenance level to update maintenance tables.                             |
|                                    | F23     | The system shall allow all users at the test level to install and test new packages, perform any low-level tests, and update all non-protected parameter values. |
| 🌠 **Data Acquisition and Quality Assessment** | F24     | The Gemini OCS shall allow the acquisition of astronomical data and online assessment of data quality.          |
|                                    | F25     | When an active user is controlling the Gemini OCS, the system shall allow other users with appropriate permissions to monitor all relevant data. |
|                                    | F26     | The system shall allow Astronomer users to access real-time data.                                               |

--- 

### Non-Functional Requirements

| Feature                            | Req No. | Requirements                                                                                                      |
|------------------------------------|---------|------------------------------------------------------------------------------------------------------------------|
| ⏳ **Availability**                 | NF01    | The system shall achieve 99.9% uptime annually.                                                                  |
| 📈 **Scalability**                 | NF02    | The system shall be designed to handle an increase in users and data over time.                                  |
| 🌍 **Languages**                   | NF03    | The System shall support multiple languages such as English, Spanish, and Hawaiian.                             |
| 🎨 **Design**                      | NF04    | The system shall allow users to switch between light and dark themes.                                           |
|                                    | NF05    | When the dark theme is selected, the system’s chat box shall display with a black background and white text.     |
|                                    | NF06    | When the dark theme is selected, the system shall use blue, orange, or green accent colors for highlights and actions. |
|                                    | NF07    | When the neutral theme is selected, the system’s chat box shall display with a light grey background and black text. |
|                                    | NF08    | When the neutral theme is selected, the system shall use subtle blues or greens as accent colors for focus areas. |
| 🔒 **Security**                    | NF09    | The system shall log all system activities, including start-ups, shut-down commands, and data transactions, with time stamps to ensure traceability and accountability. |
|                                    | NF10    | When a user attempts to access the system, the system shall ensure that only authorized personnel access specific system functionalities. |
|                                    | NF11    | The system shall store all data, including raw observation data, in redundant formats (e.g., maintaining at least two copies) to prevent loss. |
|                                    | NF12    | When sharing a report, the system shall ensure that sensitive data is protected.                                 |
| 🖥️ **Compatibility**               | NF13    | The system shall be flexible to operate on multiple operating systems (Windows, macOS, Linux) ensuring compatibility across user locations and preferences. |
|                                    | NF14    | When the user accesses the system on any device (mobile or desktop), the system shall automatically adjust the layout to fit the device’s screen size. |
|                                    | NF15    | When a report is ready, the system shall provide options for web access, email, or downloads so that users can access or receive the report. |
| ⚙️ **Maintenance**                  | NF16    | When there is low system usage, a maintenance schedule shall occur.                                             |
|                                    | NF17    | The system shall notify users of system updates, hardware upgrades, and routine maintenance in advance.          |
| 🚀 **Performance**                  | NF18    | The system shall respond within 100-200 milliseconds for real-time commands to ensure safe and precise operations. |
|                                    | NF19    | The system shall handle up to 100 simultaneous report generation requests without degradation in performance.    |
|                                    | NF20    | The system shall optimize database queries to minimize delays in retrieving observation data for at most 2 seconds. |

---
