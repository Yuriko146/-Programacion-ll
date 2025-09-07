import math

class Circulo2D:
    def __init__(self, x=0.0, y=0.0, radio=1.0):
        self.__x = x
        self.__y = y
        self.__radio = radio
    
    # Getters
    def get_x(self): return self.__x
    def get_y(self): return self.__y
    def get_radio(self): return self.__radio
    
    # Setters
    def set_x(self, x): self.__x = x
    def set_y(self, y): self.__y = y
    def set_radio(self, radio): self.__radio = radio
    
    def get_area(self):
        return math.pi * self.__radio ** 2
    
    def get_perimetro(self):
        return 2 * math.pi * self.__radio
    
    def contiene(self, x, y):
        distancia = math.sqrt((x - self.__x) ** 2 + (y - self.__y) ** 2)
        return distancia <= self.__radio
    
    def contiene_circulo(self, circulo):
        distancia = math.sqrt((circulo.get_x() - self.__x) ** 2 + (circulo.get_y() - self.__y) ** 2)
        return distancia + circulo.get_radio() <= self.__radio
    
    def sobrepone(self, circulo):
        distancia = math.sqrt((circulo.get_x() - self.__x) ** 2 + (circulo.get_y() - self.__y) ** 2)
        return distancia < (self.__radio + circulo.get_radio())
    
    def __str__(self):
        return f"Circulo2D({self.__x}, {self.__y}, {self.__radio})"

# Programa de prueba
o1 = Circulo2D(2, 0, 1)
print(f"Círculo: {o1}")
print(f"Área: {o1.get_area():.2f}")
print(f"Perímetro: {o1.get_perimetro():.2f}")
print(f"Contiene (2.5, 0): {o1.contiene(2.5, 0)}")

o2 = Circulo2D(0, 0, 0.5)
print(f"Contiene círculo o2: {o1.contiene_circulo(o2)}")
print(f"Se sobrepone con o2: {o1.sobrepone(o2)}")