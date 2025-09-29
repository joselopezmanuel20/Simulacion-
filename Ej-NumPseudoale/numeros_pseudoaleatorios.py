import random
import numpy as np
import matplotlib.pyplot as plt

# 1. Generar 10 números pseudoaleatorios uniformes entre 0 y 1
print("=== Números pseudoaleatorios (Distribución Uniforme [0,1]) ===")
numeros_uniformes = [random.random() for _ in range(10)]
print(numeros_uniformes)

# 2. Generar 10 números pseudoaleatorios con distribución normal
print("\n=== Números pseudoaleatorios (Distribución Normal media=0, desviación=1) ===")
numeros_normales = [random.gauss(0, 1) for _ in range(10)]
print(numeros_normales)

# 3. Histograma de los números uniformes
plt.figure(figsize=(6,4))
plt.hist(numeros_uniformes, bins=10, color="skyblue", edgecolor="black")
plt.title("Histograma de Números Uniformes")
plt.xlabel("Rango")
plt.ylabel("Frecuencia")
plt.show()

# 4. Histograma de los números normales
plt.figure(figsize=(6,4))
plt.hist(numeros_normales, bins=10, color="lightgreen", edgecolor="black")
plt.title("Histograma de Números Normales")
plt.xlabel("Valor")
plt.ylabel("Frecuencia")
plt.show()
