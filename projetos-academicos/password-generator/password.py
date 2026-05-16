import random
import string

print("=== GERADOR DE SENHAS ===")

caracteres = string.ascii_letters + string.digits + "!@#$%&*"

senha = ""

for i in range(12):
    senha += random.choice(caracteres)

print(f"Senha gerada: {senha}")
