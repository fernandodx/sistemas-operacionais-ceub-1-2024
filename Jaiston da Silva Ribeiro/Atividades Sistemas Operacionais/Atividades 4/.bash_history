echo "data e hoora atuais: $(date)"
echo "usuario logado: $(whoami)"
echo "diretório atual: $(pwd)"
echo "espaço livre no disco: "
df -h --output=avail/|tail -n1
chmod +x info.sh
./info.sh
