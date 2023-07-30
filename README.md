Telegram

Telegram Bot (currency notifier)

Bot description:
At the request of the user (currency pair of interest), 
the bot displays a message with the current exchange rate.
A  functionality has been implemented that allows you to:
1) subscribe to the currency pair of interest in order to receive a message
with the current exchange rate on a regular basis
2) unsubscribe from any currency pair.


Telegram Bot "Happy Hour"

Описание бота:
По запросу пользователя
Бот Telegram предоставляет информацию о
1) гороскопе на день
2) шутку на день (анекдот)
 по дате рождения.


Реализован функционал
1) подписаться на инофрмацию о дне  по дате рождения, 
чтобы регулярно получать сообщение "прогноз на день"
2) отказаться от подписки.
__________________________________________________
Какие базы DataBase
данных нужны:
1) Гороскоп
- Создать базу данных или использовать сторонние сервисы для получения информации 
о горосклпе.
- Определять текущий день.
___________________________________________________
id INT AUTO_INCREMENT PRIMARY KEY
zodiac_sign VARCHAR(20) NOT NULL
prediction TEXT NOT NULL
zodiac_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
___________________________________________________
2) Юмор
- Создать базу данных или использлвать сторонние сервисы для получения забавных шуток, 
связанных с каждым знаком зодиака
___________________________________________________
id INT AUTO_INCREMENT PRIMARY KEY,
joke_text TEXT NOT NULL,
joke_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
___________________________________________________
  Формирование ответа  для пользователя:
Создается сообщение, содержащее информацию
- прогноза на день
- шутка 
- знак зодиака пользователя.

3) Юзеры



Отправляется сформированное сообщение обратно пользователю через API Telegram.

Дополнительные функции:
-  пользователь может запросить информацию о гороскопе на любую дату, но не в будущем.
- Дпользователь может запросить шутку для другого знака зодиака.

