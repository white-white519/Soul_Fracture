<div align="center">
  <img src="https://github.com/white-white519/Soul_Fracture/assets/ваш_айди_или_картинка" width="150" height="150" alt="Soul Fracture Logo"> <!-- Замени на свою картинку, если захочешь -->
  
  # Soul Fracture 
  **Смерть — это не конец. Это лишь рассинхронизация.**

  [![Minecraft](https://img.shields.io/badge/Minecraft-1.20.1-green?style=for-the-badge&logo=minecraft)](https://minecraft.net)
  [![Forge](https://img.shields.io/badge/Forge-47.4.20-orange?style=for-the-badge&logo=curseforge)](https://files.minecraftforge.net)
  [![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
  [![Status](https://img.shields.io/badge/Status-In_Development-red?style=for-the-badge)]()

  <i>Мрачный мод на выживание, где смерть разрывает связь души и тела.</i>
</div>

---

## 📖 О проекте

**Soul Fracture**это мод, который меняет твое отношение к смерти в Minecraft. 
Здесь смерть это не просто потеря вещей и респавн. Это **рассинхронизация души**. После смерти ты получишь дебаффы, и единственный способ вернуть себя в норму — использовать древние ритуалы и крафтить опыт.

Мод находится в **активной разработке**. Сейчас доступен базовый фундамент: предметы, интерфейс и система крафта.

---

## ⚙️ Текущие фичи (v0.1.0)

- [x] 💎 **Амулет Души (Soul Amulet)**  первый артефакт мода.
- [x] 🎨 **Собственная креативная вкладка**  все предметы мода в одном месте.
- [x] 🖥 **Кастомный интерфейс (GUI)**  меню «Рассинхронизация Души», открывается по кнопке **`Y`** (или `Н`).
- [ ] 🏛 **Алтарь**  пока в разработке.
- [ ] 🧪 **Крафт Ядер**  пока в разработке.
- [ ] 🧩 **Интеграция с Create**  в планах.

---

## 🚀 Планы на будущее (Roadmap)

- [ ] Написание логики дебаффов при смерти (рассинхронизация).
- [ ] Модель и текстуры для Алтаря.
- [ ] Слоты в меню GUI для размещения Амулета.
- [ ] Использование поршней из Create для сборки Алтаря.
- [ ] Крафт Ядер из самородков опыта.

---

## 🛠 Установка

1. Установи **Minecraft 1.20.1** и **Forge 47.4.20**.
2. Скачай последнюю версию мода (`.jar`) из раздела **Releases**.
3. Закинь `.jar` файл в папку `.minecraft/mods`.
4. Запускай игру!

---

## 📸 Скриншоты

<div align="center">
  <img width="364" height="292" alt="photo_2026-10-26_18-50-27" src="https://github.com/user-attachments/assets/5152cff2-79ab-44b3-b068-205d95e4071d" />
<img width="364" height="292" alt="photo_2026-10-26_18-52-26" src="https://github.com/user-attachments/assets/78bbf1de-afa9-4864-9d63-c8f4c8e565e3" />
</div>

---

## 🧑‍💻 Для разработчиков

Мод написан на **Java** с использованием **ForgeGradle**. 
Если хочешь собрать мод из исходников:
```bash
git clone https://github.com/white-white519/Soul_Fracture.git
cd Soul_Fracture
./gradlew build
