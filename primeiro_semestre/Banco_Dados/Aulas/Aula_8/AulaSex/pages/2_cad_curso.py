import mysql.connector
import streamlit as st;

conexao = mysql.connector.connect(
    host='localhost',
    user='root',
    password='aluno',
    database='banco_curso'
)
cursor = conexao.cursor()
st.title("Cadastrar Curso")

with st.form(key="include_curso",clear_on_submit=True):
    input_nome = st.text_input(label="Nome")
    input_aulas = st.text_input(label="Aulas")
    input_valor = st.text_input(label="Valor")
    input_turno = st.selectbox("Turno",options=["MANHÃ","TARDE","NOITE"])
    col1, col2 = st.columns(2)
    with col1:
        input_button_submit = st.form_submit_button("Gravar")
    with col2:
        input_button_deletar_submit = st.form_submit_button("Excluir")

    if input_button_submit:
        comando = f'INSERT INTO curso(nome_curso,aulas,valor,turno)VALUES("{input_nome}","{input_aulas}","{input_valor}","{input_turno}")'
        cursor.execute(comando)
        conexao.commit()
    
    if input_button_deletar_submit:
        comando = f'DELETE FROM curso WHERE nome_curso = "{input_nome}"'
        cursor.execute(comando)
        conexao.commit()
cursor.close()
conexao.close()