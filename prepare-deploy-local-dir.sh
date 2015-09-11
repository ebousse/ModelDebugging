#! /usr/bin/env sh
UPDATE_SITE_DIR=simulationmodelanimation/releng/fr.obeo.dsl.debug.repository/target/
DEPLOY_LOCAL_DIR=$1
echo "Prepare deploy local dir = ${DEPLOY_LOCAL_DIR}"
# Create nightly folder
mkdir $DEPLOY_LOCAL_DIR 
# Copy update-site and target platform to deploy local dir
cp -r $UPDATE_SITE_DIR/repository $DEPLOY_LOCAL_DIR
cp -r $UPDATE_SITE_DIR/*.zip $DEPLOY_LOCAL_DIR
echo "ls ${DEPLOY_LOCAL_DIR}"
ls $DEPLOY_LOCAL_DIR
