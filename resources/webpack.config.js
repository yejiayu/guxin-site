const webpack = require('webpack')
const path = require('path')

module.exports = {
    //页面入口文件配置
    entry: {
        index : './src/main.js'
    },
    //入口文件输出配置
    output: {
        path: 'public/build/',
        filename: 'main.js'
    },
    progress: true,
    module: {
      loaders: [
        {
          test: /.js?$/,
          include: path.join(__dirname, 'src'),
          loader: 'babel',
          query: {
            presets: ['es2015']
          }
        },
        { test: /\.scss$/, loader: "style!css!sass" },
      ]
    }
}
