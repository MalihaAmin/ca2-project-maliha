FROM node:alpine
WORKDIR /usr/src/app
COPY ./package.json ./
COPY ./package-lock.json ./
RUN npm install
COPY ./config ./config
COPY ./public ./public
COPY ./fe-server.js ./
CMD ["node", "fe-server.js"]