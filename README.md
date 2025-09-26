# sabana-design-pattern
Actividad 1: Diplomado universidad de La Sabana - Patrones  de diseño.

# Integrantes
Alexy Yesenia Rincón Capera
Harver Andrey Cordero Duarte
Karen Ximena Orozco Gamboa

## Escenario 1: Sistema de Personalización Automotriz

### Descripción del Escenario
Desarrollo de una aplicación para una compañía automotriz que permite a los clientes personalizar y ordenar un automóvil. Un objeto Automóvil puede tener múltiples configuraciones opcionales:
- Tipo de motor
- Color
- Llantas
- Sistema de sonido
- Interiores
- Techo solar
- Navegación GPS

### Problema Identificado
Crear un objeto Automóvil con múltiples configuraciones puede llevar a:
- **Constructor telescópico**: constructores multi parámetros.
- **Múltiples constructores sobrecargados**: dificultad en mantenimiento y legibilidad del código.

### Patrón de Diseño Aplicado: **CREACIONAL - PATRÓN BUILDER**

### ¿Por qué Builder Pattern?

**El Patrón Builder es la solución ideal para este escenario ¿por qué?:**

1. **Resuelve el problema del constructor telescópico**: En lugar de tener un constructor con n parámetros, el patron Builder permite configurar el objeto, en este caso el automovil, paso a paso, añadiendo tantas personalizaciones como sean requeridas.

2. **Cumple con los beneficios esperados**:
   - ✅ **Legibilidad y claridad**: Construcción fluida y expresiva
   - ✅ **Inmutabilidad**: El objeto Car final es inmutable una vez construido
   - ✅ **Flexibilidad**: Atributos opcionales sin múltiples constructores
   - ✅ **Separación de construcción y representación**: La lógica de construcción está en CarBuilder, separada de la clase Car

3. **Características del patrón que coinciden con el problema**:
   - **Construcción compleja**: El automóvil tiene múltiples componentes opcionales.
   - **Configuraciones variables**: Diferentes combinaciones de características.
   - **Proceso paso a paso**: Cada característica se configura individualmente.
   - **Producto final inmutable**: Una vez construido, el objeto Car no se modifica.

### Implementación en el Proyecto
- **Producto**: `Car.java` - El automóvil final
- **Builder Interface**: `CustomizationCar.java` - Define los pasos requeridos de construcción de un objeto Car.
- **Builder Concreto**: `CarBuilder.java` - Implementa la construcción paso a paso para el auto en cuestión.
- **Director**: `CarDirector.java` - Orquesta el proceso de construcción del objetotipo Car.

### Diagrama de Clases Escenario 1 (Patrón Builder)

```mermaid
classDiagram
    class Client {
        + customizeCar(CustomizationCar)
        + getCarOrder() Car
    }
    
    class CarDirector {
        + makeBasicCar() Car
        + makeCustomCar() Car
    }
    
    class Car {
        - engine String
        - color String
        - tires String
        - soundSystem String
        - interiors String
        - sunroof boolean
        - gps boolean
        + setEngine(String engine)
        + setColor(String color)
        + setTires(String tires)
        + setSoundSystem(String sound)
        + setInteriors(String interiors)
        + setSunroof(boolean hasSunroof)
        + setGps(boolean hasGps)
    }
    
    class CustomizationCar {
        <<interface>>
        + setEngine(String motor)
        + setColor(String color)
        + setTires(String tires)
        + setSoundSystem(String llantas)
        + setInteriors(String interiors)
        + setSunroof(boolean hasSunroof)
        + setGps(boolean hasGps)
    }
    
    class CarBuilder {
        - car Car
        + CarBuilder()
        + setEngine(String motor)
        + setColor(String color)
        + setTires(String tires)
        + setSoundSystem(String)
        + setInteriors(String interiors)
        + setSunroof(boolean hasSunroof)
        + setGps(boolean hasGps)
        + getCar() Car
    }
    
    Client --> CarDirector
    CarDirector --> CustomizationCar : uses
    CustomizationCar <|.. CarBuilder : implements
    Car <.. CarBuilder : creates
    Client ..> Car : uses
```
