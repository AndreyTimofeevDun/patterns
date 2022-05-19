flyweight, «легковесный (элемент)») — структурный шаблон проектирования, при котором объект, представляющий себя как уникальный экземпляр в разных местах программы, по факту не является таковым.

Flyweight используется для уменьшения затрат при работе с большим количеством мелких объектов. При проектировании Flyweight необходимо разделить его свойства на внешние и внутренние. Внутренние свойства всегда неизменны, тогда как внешние могут отличаться в зависимости от места и контекста применения и должны быть вынесены за пределы приспособленца.

Flyweight дополняет шаблон Factory Method таким образом, что при обращении клиента к Factory Method для создания нового объекта ищет уже созданный объект с такими же параметрами, что и у требуемого, и возвращает его клиенту. Если такого объекта нет, то фабрика создаст новый.