# Prácticas de Programación - UPV (1 y 3)

Este repositorio contiene la implementación de las Prácticas 1 y 3 de la asignatura de Programación de la Universitat Politècnica de València (UPV).

## Descripción General

El proyecto simula la gestión de una tienda de ropa, permitiendo:
- Gestión de inventario de prendas.
- Procesamiento de ventas y registro de estadísticas.
- Carrito de compras con operaciones de añadir, eliminar, confirmar y mostrar productos.

El código está organizado en paquetes según la funcionalidad: `shop`, `cart`, `sales`, y `app`.

## Estructura del Proyecto

- **src/shop/**: Clases para la gestión de prendas (`ClothingItem`) e inventario (`Inventory`).
- **src/cart/**: Implementación de la estructura de datos para el carrito de compras (`CartItem`, `LinkedCart`, etc.).
- **src/sales/**: Registro de ventas y operaciones sobre el carrito (`SalesRegister`, `ShoppingRegister`).
- **src/app/**: Clase principal (`Main.java`) con menú interactivo para el usuario.
- **src/test/**: Clases de test para verificar el correcto funcionamiento de los módulos.

## Ejecución

1. Compila el proyecto con tu IDE o desde terminal:
   ```sh
   javac -d bin src/**/*.java
   ```
2. Ejecuta la aplicación principal:
   ```sh
   java -cp bin app.Main
   ```

## Funcionalidades Principales

- **Inventario**: Añadir, mostrar, eliminar y extraer prendas.
- **Ventas**: Procesar ventas y mostrar estadísticas (total de ventas y capital acumulado).
- **Carrito de compras**: Añadir/eliminar productos, confirmar compra y mostrar el carrito.
- **Tests**: Clases de test para cada módulo principal.

## Créditos

Prácticas realizadas para la asignatura de Programación (UPV).

---

> **Nota:** Este proyecto es parte de las prácticas universitarias y está orientado al aprendizaje de conceptos básicos de programación orientada a objetos en Java.
