pipeline {
    agent any
    
    stages {
        stage('Run Python Script') {
            steps {
                script {
                    // Запускаем скрипт Python
                    def result = sh(script: 'python script.py', returnStatus: true)
                    if (result != 0) {
                        echo "Скрипт завершился с ошибкой (код возврата ${result})"
                    }
                }
            }
        }
    }
    
    post {
        always {
            echo 'Этот шаг выполнится всегда'
            
            
        }
    }
}
