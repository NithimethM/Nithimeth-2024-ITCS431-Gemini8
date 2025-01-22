
### Functional Requirements 
| Feature                            | Req No. | Requirements                                                                                                      |
|------------------------------------|---------|------------------------------------------------------------------------------------------------------------------|
| 🌐 **Remote Monitoring**           | F01     | The Gemini OCS shall provide remote access and monitoring capabilities.                                           |
|                                    | F02     | While planned downtime, the system’s functions such as monitoring and data retrieval shall remain accessible.      |
|                                    | F03     | The system shall allow Astronomer users to access real-time data.                                                |
|                                    | F04     | The system shall allow Astronomer users to simulate telescope behavior.                                          |
|                                    | F05     | The system shall allow multiple users to log into the Gemini OCS with secure and privilege-based access to any telescope. |
|                                    | F06     | When an active user is controlling the Gemini OCS, the system shall allow other users with appropriate permissions to monitor all relevant data. |
|                                    | F07     | The Gemini OCS shall allow the tools for science observers to review and adjust observing programs.              |
| 🤖 **Observation Automation**      | F08     | When sequences are observed, the Gemini OCS shall automate the observation and shall allow interactive options when necessary. |
|                                    | F09     | When scheduling tasks and observing commands, the Gemini OCS shall use a queue-based approach.                   |
| 🛰️ **Science Plan Management**    | F10     | The Gemini OCS shall allow astronomers to create, test, and submit science plans, collect data, and validate its quality. |
|                                    | F11     | When a science plan is submitted, the Gemini OCS shall allow science observers to validate science plans.         |
|                                    | F12     | When a science plan is validated, the system shall allow science observers to transform it into executable programs, monitor observations, and make adjustments to them. |
|                                    | F13     | When an observation is completed, the system shall generate a report with key details.                           |
|                                    | F14     | When data is collected, the system shall generate a quality assessment report.                                    |
|                                    | F15     | When a report is generated, the system shall allow access based on the user’s role.                              |
| 💼 **Role-Based Operations**       | F16     | The system shall allow all users at the observing level to perform a certain number of embedded tests.           |
|                                    | F17     | The system shall allow all users at the maintenance level to update maintenance tables.                          |
|                                    | F18     | The system shall allow all users at the test level to install and test new packages, perform any low-level tests, and update all non-protected parameter values. |
| 💡 **Data and Alerts**             | F19     | The Gemini OCS shall provide real-time data on quality assessment, performance, and collected data.             |
|                                    | F20     | The system shall generate and display a real-time alert to administrators when a system failure occurs.          |
| 📊 **Report System**               | F21     | When resources or budgets are allocated, the system shall generate the financial reports (usages and costs).     |
|                                    | F22     | When a report is ready, the system shall provide options for web access, email, or downloads so that users can access or receive the report through their preferred method. |
|                                    | F23     | When a report is generated, the system shall allow users to download or view the report according to their role and permissions. |

--- 

### Non-Functional Requirements 
| Feature                            | Req No. | Requirements                                                                                                      |
|------------------------------------|---------|------------------------------------------------------------------------------------------------------------------|
| 🌍 **Language Support**            | NF01    | The System shall support multiple languages such as English, Spanish, and Hawaiian.                              |
| 🎨 **Design and Theme**            | NF02    | The system shall allow users to switch between light and dark themes.                                            |
|                                    | NF03    | When the dark theme is selected, the system’s chat box shall display with a black background and white text.      |
|                                    | NF04    | When the dark theme is selected, the system shall use blue, orange, or green accent colors for highlights and actions. |
|                                    | NF05    | When the neutral theme is selected, the system’s chat box shall display with a light grey background and black text. |
|                                    | NF06    | When the neutral theme is selected, the system shall use subtle blues or greens as accent colors for focus areas. |
| 🔒 **Security**                    | NF07    | The system shall log all system activities, including start-ups, shut-down commands, and data transactions, with time stamps to ensure traceability and accountability. |
|                                    | NF08    | The system shall use multi-user login and configuration processes to ensure that only authorized personnel access specific system functionalities. |
|                                    | NF09    | The system shall store all data, including raw observation data, in redundant formats (e.g., maintaining at least two copies) to prevent loss. |
|                                    | NF10    | When sharing a report, the system shall ensure that sensitive data is protected.                                 |
| 🖥️ **Compatibility**               | NF11    | The system shall be flexible to operate on multiple operating systems (Windows, macOS, Linux) ensuring compatibility across user locations and preferences. |
|                                    | NF12    | When the user accesses the system on any device (mobile or desktop), the system shall automatically adjust the layout to fit the device’s screen size. |
|                                    | NF13    | When a report is ready, the system shall provide options for web access, email, or downloads so that users can access or receive the report through their preferred method. |
| 🔧 **Maintenance**                 | NF14    | When there is low system usage, a maintenance schedule shall occur.                                              |
|                                    | NF15    | The system shall notify users of system updates, hardware upgrades, and routine maintenance in advance.          |
| ⚡ **Performance**                  | NF16    | The system shall respond within 100-200 milliseconds for real-time commands to ensure safe and precise operations. |
---