import {useState} from 'react';
import { StyleSheet, Text, View, TextInput, Button } from 'react-native';
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function App() {
  const [nome, setNome] = useState('');

  const [mensagem, setMensagem] = useState('');

  const salvarNome = async () => {
    try{
      await AsyncStorage.setItem('nomeUsuario', nome);

      setMensagem('Nome salvo com sucesso!');
      setNome('');
    } catch (error){
      setMensagem('Erro ao salvar nome: ' + error);
    }
  };

  return (
    <View style={styles.container}>
      <Text>Digite seu nome:</Text>
      <TextInput
        style={styles.input}
        value={nome}
        onChangeText={setNome}
      />
      <Button title='Salvar Nome' onPress={salvarNome} />
      <Text style={styles.mensagem}>{mensagem}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    marginBottom: 10,
    paddingHorizontal: 10,
    width: '80%',
  },
  mensagem: {
    marginTop: 10,
    fontWeight: 'bold',
  },
});
