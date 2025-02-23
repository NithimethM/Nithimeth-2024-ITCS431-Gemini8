# Gemini8 - Delivery 3
---

## Use Case Diagram

![Use Case Diagram](images/gemini_use_case_final.png)

### Selected Use Cases
From the final use case diagram, we have selected the following 5 use cases:

1. **Create Science Plan**
2. **Validate Science Plan**
3. **Test Science Plan**
4. **Create Observing Program**
5. **Validate Observing Program**

--- 
## Use Case Descriptions: Create Science Plan

<table>
  <tr>
    <td><strong>Use Case name:</strong> Create Science Plan</td>
    <td><strong>ID: 1</strong></td>
    <td><strong>Importance Level:</strong> High</td>
  </tr>
  <tr>
    <td colspan="2"> <strong> Primary Actor: </strong> Astronomer</td>
    <td> <strong>Use Case Type:</strong> Scientific Process</td>
  </tr>
  <tr>
    <td colspan="3">
        <strong>Stakeholders and Interests</strong>
        <ul style="list-style-type: none; padding-left: 20px;">
            <li><strong>Astronomer</strong> – Wants to create a science plan for observing desired astronomical data.</li>
            <li><strong>Science Observer</strong> – Must validate and execute the science plan in observation plans they create.</li>
            <li><strong>Administrator</strong> – Manages permissions for modifying and accessing existing science plans.</li>
        </ul>
    </td>
    </tr>
    <tr>
        <td colspan="3"><strong>Brief Description</strong><br>This use case demonstrates the process of creating a science plan, which will be used in an observation plan to collect astronomical data.</td>
    </tr>
    <tr>
        <td colspan="3"><strong>Trigger</strong><br>The astronomer wishes to create a science plan to collect astronomical data.</td>
    </tr>
    <tr>
        <td colspan="3"><strong>Type</strong><br>Internal</td>
    </tr>
    <tr>
        <td colspan="3">
            <strong>Relationships</strong><br>
            <strong>Association:</strong> Astronomer<br>
            <strong>Include:</strong> None<br>
            <strong>Extend:</strong> None<br>
            <strong>Generalization:</strong> None
        </td>
    </tr>
    <tr>
        <td colspan="3"><strong>Normal Flow of Events</strong><br>
        <ol style="padding-left: 40px;">
            <li>The astronomer navigates to the science plan creation module.</li>
            <li>The astronomer enters required details for the science plan creation.</li>
            <li>The astronomer submits the completed science plan.</li>
            <li>The Science plan creation module verifies and checks the submitted science plan.</li>
            <li>The Science plan creation module creates a science plan and stores it.</li>
            <li>If the astronomer would like to specify a science observer to validate the science plan:</li>
            <ul>
                <li>The <strong>S-1: Request Validation</strong> subflow is performed.</li>
            </ul>
        </ol>
        </td>
    </tr>
    <tr>
    <td colspan="3"><strong>Subflows</strong><br>
        <strong>S-1: Request Validation</strong>
        <ol style="padding-left: 40px;">
            <li>The Science plan creation module prompts the astronomer to provide the identifier of the science observer to validate the science plan.</li>
            <li>The Science plan creation module searches for the science observer that matches the identifier.</li>
            <li>The Science plan creation module sends a notification to the observer about the validation request.</li>
        </ol>
    </td>
</tr>
<tr>
    <td colspan="3"><strong>Alternate / Exceptional Flow</strong><br>
        <strong>4, a:</strong> If the Science plan creation module detects unusual or invalid inputs, it performs an alternate flow:
        <ol style="padding-left: 60px;">
            <li>The Science plan creation module displays a warning message specifying the detected issue(s).</li>
            <li>The astronomer is given two options:</li>
            <ul>
                <li><strong>Option 1:</strong> Modify Inputs – The astronomer is redirected to the input fields for correction.</li>
                <li><strong>Option 2:</strong> Proceed Anyway – The system tags the science plan with a warning and proceeds.</li>
            </ul>
        </ol>
    </td>
</tr>
</table>

---

### Use Case Description: Test Science Plan

<table>
  <tr>
    <td><strong>Use Case name:</strong> Test a Science Plan</td>
    <td><strong>ID: 2</strong></td>
    <td><strong>Importance Level:</strong> High</td>
  </tr>
  <tr>
    <td colspan="2"> <strong> Primary Actor: </strong> Astronomer</td>
    <td> <strong>Use Case Type:</strong> Testing</td>
  </tr>
  <tr>
    <td colspan="3">
        <strong>Stakeholders and Interests</strong>
        <ul style="list-style-type: none; padding-left: 20px;">
            <li><strong>Astronomer</strong> – Wants to ensure the science plan is correctly designed before submission.</li>
            <li><strong>Science Observer</strong> – Ensures the science plan meets the required observational and operational standards before execution.</li>
        </ul>
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Brief Description</strong><br>This use case allows an astronomer to test a prepared science plan using the interactive observing system (virtual telescope) to check its feasibility before submission to the system.</td>
  </tr>
  <tr>
    <td colspan="3"><strong>Trigger</strong><br>The astronomer has created a science plan.</td>
  </tr>
  <tr>
    <td colspan="3"><strong>Type</strong><br>Internal</td>
  </tr>
  <tr>
    <td colspan="3">
        <strong>Relationships</strong><br>
        <strong>Association:</strong> Astronomer<br>
        <strong>Include:</strong> Operate the Interactive Observing (Virtual Telescope)<br>
        <strong>Extend:</strong> None<br>
        <strong>Generalization:</strong> None
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Normal Flow of Events</strong><br>
        <ol style="padding-left: 40px;">
            <li>The astronomer selects a science plan for testing.</li>
            <li>The system retrieves the plan and displays relevant details, including observation sequences, telescope settings, and estimated execution time.</li>
            <li>The astronomer initiates the simulation using the virtual telescope.</li>
            <li>The system processes the plan, simulating telescope movements, data collection, and environmental conditions.</li>
            <li>If errors or inefficiencies are detected:</li>
            <li>If the plan works correctly, the astronomer submits the science plan to the system.</li>
        </ol>
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Subflows</strong><br>
        <strong>None</strong>
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Alternate / Exceptional Flow</strong><br>
        <strong>5a:</strong> Modify the science plan and test by simulation using the virtual telescope. Check the result.
    </td>
  </tr>
</table>

---

### Use Case Description: Validate Science Plan

<table>
  <tr>
    <td><strong>Use Case name:</strong> Validate Science Plan</td>
    <td><strong>ID: 3</strong></td>
    <td><strong>Importance Level:</strong> High</td>
  </tr>
  <tr>
    <td colspan="2"> <strong> Primary Actor: </strong> Science Observer</td>
    <td> <strong>Use Case Type:</strong> Validation</td>
  </tr>
  <tr>
    <td colspan="3">
        <strong>Stakeholders and Interests</strong>
        <ul style="list-style-type: none; padding-left: 20px;">
            <li><strong>Science Observer</strong> – Ensures that the science plan meets the required observational and operational standards before execution.</li>
            <li><strong>Astronomer</strong> – Relies on validation to proceed with observations.</li>
            <li><strong>Administrator</strong> – Ensures compliance with institutional policies and system integrity.</li>
        </ul>
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Brief Description</strong><br>This use case describes the process of a science observer validating a submitted science plan before it is approved for execution.</td>
  </tr>
  <tr>
    <td colspan="3"><strong>Trigger</strong><br>A science plan is submitted by an astronomer for review.</td>
  </tr>
  <tr>
    <td colspan="3"><strong>Type</strong><br>Internal</td>
  </tr>
  <tr>
    <td colspan="3">
        <strong>Relationships</strong><br>
        <strong>Association:</strong> Science Observer<br>
        <strong>Include:</strong> None<br>
        <strong>Extend:</strong> None<br>
        <strong>Generalization:</strong> None
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Normal Flow of Events</strong><br>
        <ol style="padding-left: 40px;">
            <li>The science observer navigates to the Science Plan Validation Module.</li>
            <li>The science observer selects a submitted science plan for validation.</li>
            <li>The system retrieves plans and displays relevant details.</li>
            <li>The observer selects a plan.</li>
            <li>If the plan is “validated”, “Pending Revision”, or “Rejected”, the system displays plan details and ends the process.</li>
            <li>If the plan status is “not validated”, the observer reviews the plan for completeness, feasibility, and adherence to guidelines.</li>
            <li>If changes are required:</li>
            <ul>
                <li>The <strong>S-1: Request Modifications</strong> subflow is performed.</li>
            </ul>
            <li>The science observer approves or rejects the plan.</li>
            <li>If the plan is approved, its status updates to "Validated".</li>
            <li>If the plan is rejected, its status updates to "Rejected".</li>
            <li>The system updates the status of the science plan.</li>
        </ol>
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Subflows</strong><br>
        <strong>S-1: Request Modifications</strong>
        <ol style="padding-left: 40px;">
            <li>The science observer enters modification requests and comments.</li>
            <li>The system sends the modification request to the astronomer.</li>
            <li>The system marks the science plan as Pending Revision.</li>
            <li>The astronomer updates and resubmits it for validation.</li>
        </ol>
    </td>
  </tr>
  <tr>
    <td colspan="3"><strong>Alternate / Exceptional Flow</strong><br>
        <strong>2,a1:</strong> There are no pending science plans available for review.<br>
        <strong>7,a2:</strong> The science plan has already been validated by another observer.
    </td>
  </tr>
</table>


---

## Activity Diagrams



---

## Sequence Diagrams


---

## Class Diagram

![Class Diagram](diagrams/class_diagram.png)
