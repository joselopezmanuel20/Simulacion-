# EJEMPLO DE NÚMEROS PSEUDOALEATORIOS EN R

# 1. Generar 10 números aleatorios uniformes entre 0 y 1
numeros <- runif(10, min = 0, max = 1)
cat("Números pseudoaleatorios generados:\n")
print(numeros)

# 2. Graficar los números generados
hist(numeros, 
     main = "Histograma de Números Pseudoaleatorios",
     xlab = "Valores",
     ylab = "Frecuencia",
     col = "lightblue",
     border = "black")

# 3. Ejemplo con distribución normal
numeros_normales <- rnorm(10, mean = 0, sd = 1)
cat("\nNúmeros pseudoaleatorios con distribución normal:\n")
print(numeros_normales)

# Graficar los números normales
hist(numeros_normales, 
     main = "Histograma de Distribución Normal",
     xlab = "Valores",
     ylab = "Frecuencia",
     col = "lightgreen",
     border = "black")

