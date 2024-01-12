// install awscli
def aws_credentials() {
sh """    
sudo rm -rf $HOME/.aws || true
sudo mkdir -p $HOME/.aws || true
sudo chown -R jenkins:jenkins $HOME/.aws

cat <<EOF >  $HOME/.aws/credentials
[default]
aws_access_key_id = ${AWS_ACCESS_KEY_ID}
aws_secret_access_key = ${AWS_SECRET_ACCESS_KEY}
EOF

cat <<EOF >  $HOME/.aws/config
[default]
region = ${params.AWS_REGION}
output = json
EOF
"""
}
