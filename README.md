# Java Alarm Clock

A simple and efficient **Digital Alarm Clock** application built using **Java Swing** and **AWT**. This desktop application displays the current system time in real-time and allows users to set custom alarms. When the alarm triggers, it alerts the user with a visual message and/or sound.

# Features

* **Real-time Digital Clock:** Displays current hours, minutes, and seconds (HH:MM:SS) with live updates.
* **Set Alarm:** User-friendly interface to input specific alarm timings.
* **Alarm Notification:** Triggers a popup message (and optional sound) when the set time is reached.
* **Reset Functionality:** Ability to clear or reset existing alarms.
* **Lightweight:** Runs smoothly on any machine with Java installed.

# Technology Stack

* **Language:** Java (JDK 8+)
* **GUI Framework:** Java Swing & AWT (Abstract Window Toolkit)
* **Threading:** Multithreading used to update the clock display every second without freezing the UI.
* **IDE:** IntelliJ IDEA / Eclipse / NetBeans


# Project Structure

The project typically consists of the following components:

| File Name | Description |
| :--- | :--- |
| **`AlarmClock.java`** | The main entry point. Handles the GUI layout, time display logic, and alarm comparison. |
| **`Sound.java`** | (Optional) Handles loading and playing the alarm sound file. |
| **`alarm_sound.wav`** | (Optional) The audio file played when the alarm triggers. |


# Contributing

Contributions are welcome! If you want to add features like "Snooze" or "Multiple Alarms":

