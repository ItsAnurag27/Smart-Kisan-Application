# 🌾 Smart Kisan – Empowering Farmers with Smart Agriculture

Smart Kisan is a smart farming platform built to transform traditional agriculture by integrating real-time monitoring, disease detection, and intelligent crop management. Using Android technology and Firebase, Smart Kisan provides farmers with a simple yet powerful app that brings precision farming to their fingertips.

---

## 🚀 Key Features

- 📡 **Sensor Monitoring**: Real-time data from soil, temperature, and humidity sensors.
- 🤖 **Disease Detection**: Early warnings based on plant condition and sensor data.
- 📈 **Crop Yield Prediction**: Forecasting based on historical and environmental data.
- 📱 **Android App Interface**: Simple, local-language-friendly mobile interface for farmers.
- 🔔 **Smart Alerts & Recommendations**: Timely notifications for irrigation, fertilizer use, and pest control.

---

## 🛠️ Tech Stack

| Layer           | Technology / Tool          |
|----------------|-----------------------------|
| 📱 Mobile App   | Java, XML (Android Studio)  |
| 🎨 UI Design    | Figma                       |
| ☁️ Backend      | Firebase (Realtime DB, Firestore, Auth, Cloud Functions) |
| 🔌 IoT (Optional)| Arduino / ESP32 (future integration) |

---

## 🧱 Architecture Overview

```plaintext
[ IoT Sensors ]
        ↓
[ Firebase Backend ]
   └── Realtime Database / Firestore
   └── Authentication
   └── Cloud Messaging
        ↓   
[ Android App (Java, XML) ]
        

```

---

## 📸 UI Mockups & Screenshots

-

  ![Login Page](screenshots/login_page.jpeg)  
  ![Sensor-Monitor](screenshots/Sensor_monitor.jpeg)  
  ![Climate](screenshots/Climate.jpeg)

---

## 📦 Installation & Setup

### Prerequisites

- Android Studio installed
- Firebase project configured
- Java 8 or above

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/istAnurag27/smart-Kisan-Application.git
   ```

2. **Open in Android Studio**  
   Open the `SmartKisan` folder and let Gradle sync.

3. **Connect Firebase**  
   - Use `Tools > Firebase` in Android Studio.
   - Connect to your Firebase project.
   - Enable Realtime Database / Firestore and Authentication.

4. **Run the app**  
   Use an emulator or physical Android device.

---

## 📁 Folder Structure (Android)

```plaintext
SmartKisan/
├── app/
│   ├── java/com/yourname/smartkisan/
│   │   ├── activities/
│   │   ├── adapters/
│   │   ├── models/
│   │   ├── utils/
│   │   └── MainActivity.java
│   ├── res/
│   │   ├── layout/
│   │   ├── drawable/
│   │   ├── values/
│   │   └── mipmap/
│   └── AndroidManifest.xml
├── build.gradle
├── google-services.json
└── README.md
```

---

## 🧪 Features Under Development

- 🌐 Multilingual Support (Hindi, etc.)
- 📷 Image-based disease detection using ML Kit
- 🧠 AI for smarter irrigation suggestions
- 🌱 Integration with local weather API

---

## 🙌 Contributors

- **Anurag Kumar Gupta** – IOT Coding and Connections [Project Lead]
- **Keshav Prajapati** - Android Developer
- **Sumit Gupta** - Android Developer
- **Mansi Goyal** - Designer

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 💬 Contact

Got feedback or suggestions?

📧 anuragguptap0@gmail.com.com  
🔗 [LinkedIn](https://www.linkedin.com/in/anurag-gupta-92962019b/)  
🔗 [GitHub](https://github.com/itsAnurag27)

---

> **Smart Kisan** – Bringing innovation to the roots of agriculture. 🌱
