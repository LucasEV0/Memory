from flask import Flask, jsonify
from flask_cors import CORS  # Importa la extensión CORS

app = Flask(__name__)
CORS(app)  # Habilita CORS para permitir solicitudes desde tu frontend de Compose

@app.route('/api/data', methods=['GET'])
def get_data():
    data = {'message': '¡Hola desde el backend de Flask!'}
    return jsonify(data)

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)