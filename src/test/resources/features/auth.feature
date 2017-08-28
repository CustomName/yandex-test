# language: ru

Функционал: Работа поиска на сайте https://yandex.ru

  @001
  Сценарий: URL в результате поиска соответствует запросу
    Дано Страница ГЛАВНАЯ
    Тогда Заголовок страницы должен быть "Яндекс — поиск №1 в России"
    Если Ввести "Аргус телеком спб" в поле поиска на странице ГЛАВНАЯ
    Если Нажать на кнопку НАЙТИ на странице ГЛАВНАЯ
    Тогда Заголовок страницы должен содержать "Аргус телеком спб"
    Дано Страница РЕЗУЛЬТАТЫ ПОИСКА
    Тогда URL в результате поиска на позиции 1 должен быть равен "argustelecom.ru"

  @002
  Сценарий: Пустой результат пустого поискового запроса
    Дано Страница ГЛАВНАЯ
    Тогда Заголовок страницы должен быть "Яндекс — поиск №1 в России"
    Если Ввести "" в поле поиска на странице ГЛАВНАЯ
    Если Нажать на кнопку НАЙТИ на странице ГЛАВНАЯ
    Тогда Заголовок страницы должен содержать "ничего не найдено"
    Дано Страница РЕЗУЛЬТАТЫ ПОИСКА
    Тогда Результат запроса пуст